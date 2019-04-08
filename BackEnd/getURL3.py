try: 
	from googlesearch import search 
except ImportError:  
	# print("No module named 'google' found")
	pass 

def URLFinder(line):
# to search 
# inp = open("sentenceExtractedNew.txt","r+")
# inp = open("contentFile.txt","r+")

# for line in inp:
# print(line)
# query = "car"
# i=0
# URLS = ["None"]*10
	# print("\n")
	i=0
	URLs = [None]*3
	# URLs = None
	# for j in search(line, tld="com", num=10, stop=3, pause=1):
	for j in search(line, tld="com", num=10, stop=3, pause=1): 
		URLs[i] = j
		# URLs = j
		i = i+1
# print(j)

	return URLs
# URLS[i] = j
# i+=1