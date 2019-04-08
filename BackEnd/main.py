import getURL
import webSearch
# import compareContent
import comparefuzzy

content = open("fileInputContent.txt","r+")
matched = open("matchedSources.txt","w+")
linecount=0
# plagflag=0
plagper=0

for contentline in content:

	linecount+=1

	# URLsToCheck = [None]*3	#For checking first 3 URLs
	URLsToCheck = None
	URLsToCheck = getURL.URLFinder(contentline)

	# for j in range(3):
	# if(URLsToCheck[j]!=None):
	if(URLsToCheck!=None):
		# print("Checking: "+URLsToCheck[j]+"\n")
		# webSearch.searchResults(URLsToCheck[j])
		webSearch.searchResults(URLsToCheck)
		# print("Scrapped Text from "+URLsToCheck[j]+"\n")
	# if(compareContent.check(contentline)):
	# 	# print("A Plag Found!!!...\n")
	# 	plagflag+=1
	# 	break
	somevar =comparefuzzy.check(contentline)
	plagper += somevar
	if(somevar>70): matched.write("Line-"+str(linecount)+"::"+URLsToCheck+"\n")

plagper /= linecount
# plagper *= 100
# print("Percentage Plagiarised = "+ str(plagper) +"%\n")
print(str(plagper))
# print("Percentage Unique = "+ str(100-plagper) +"%\n\n")
matched.close()
content.close()