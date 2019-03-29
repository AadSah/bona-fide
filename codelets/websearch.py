#This code parses the HTML code of a given website and extracts/scraps the text from the site
import urllib
from bs4 import BeautifulSoup

import urllib.request

urlname = "https://en.wikipedia.org/wiki/Car"	#The URL name of the webpage you want to scrap
# with urllib.request.urlopen("https://en.wikipedia.org/wiki/Plagiarism") as url:
url = urllib.request.urlopen(urlname)	#The URL of the webpage you want to scrap
html = url.read()	#reads the HTML Code

soup = BeautifulSoup(html)	#parses the HTML Code

#Delete all script and style elements
for script in soup(["script", "style"]):
    script.extract()    #rip it out

text = soup.get_text()	#Gets text

lines = (line.strip() for line in text.splitlines())	#Break into lines and remove leading and trailing space on each line

chunks = (phrase.strip() for line in lines for phrase in line.split("  "))	#Break multi-headlines into a line each

text = '\n'.join(chunk for chunk in chunks if chunk)	#Drop blank lines

######   Now write the parsed text to a file   ##########
outfile = open("extractedWeb.txt","w+")
outfile.write(urlname+"\n")
outfile.write(text)
#########################################################

print(text)	#Prints the Text Extracted