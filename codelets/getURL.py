try: 
	from googlesearch import search 
except ImportError:  
	print("No module named 'google' found") 

# to search 
inp = open("sentenceExtractedNew.txt","r+")

for line in inp:
	print(line)
# query = "car"
# i=0
# URLS = ["None"]*10
	print("\n")
	for j in search(line, tld="com", num=10, stop=3, pause=1): 
		print(j)
# URLS[i] = j
# i+=1 
