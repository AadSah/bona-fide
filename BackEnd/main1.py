#plag-check using only the first url...fast but not accurate a bit...
import getURL1
import webSearch
import comparefuzzy

content = open("MyTestFile.txt","r+")	#user data importing...
matched = open("matchedSources.txt","w+")	#to write the matched sources or urls...
highlight = open("highlightedText.txt","w+")	#to write the text with plagiarised content marked...

linecount=0	#keeps a line count
plagper=0	#finds the plagiarism percentage
for contentline in content:	#going through each line in the user data

	if(contentline!="\n"):	#get rid of unrequired lines read
		
		linecount+=1	#keep a count of content lines 

		URLsToCheck = None#variable to store url found
		URLsToCheck = getURL1.URLFinder(contentline)	#finds the url

		somevar=0	#a flag variable

		if(URLsToCheck!=None):
			webSearch.searchResults(URLsToCheck)	#scraps from the url
			somevar = comparefuzzy.check(contentline)	#compares with the scraped data
			if(somevar>85):
				plagper += 100	#kept a threshold value of 85% as per the performance of the algo seen before...for Levenshtein Distance

				matched.write("Line-"+str(linecount)+"::"+URLsToCheck+"\n")	#writing for matched sources
				# highlight.write("<font color=\"red\"><b>"+contentline+"</b></font>\n")	#writing for highlighting
				highlight.write(contentline.upper() + "{" + URLsToCheck + "}\n")
			else:
				plagper += somevar

				highlight.write(contentline)	#writing non-highlighted

#NOTE: But to decide whether a Document is Plagiarised or Not, we have kept a threshold value of 70%...or as per the user...

plagper /= linecount	#getting the percentage
uniper = 100 - plagper
print("{:.2f}".format(plagper)+"%")	#print the result
print("{:.2f}".format(uniper)+"%")	#print the result
#closing the streams...
highlight.close()
matched.close()
content.close()