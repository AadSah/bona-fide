import getURL
import webSearch
import compareContent

content = open("fileInputContent.txt","r+")
linecount=0
plagflag=0

for contentline in content:

	linecount+=1

	URLsToCheck = [None]*3
	URLsToCheck = getURL.URLFinder(contentline)

	for j in range(3):
		if(URLsToCheck[j]!=None):
			# print("Checking: "+URLsToCheck[j]+"\n")
			webSearch.searchResults(URLsToCheck[j])
			# print("Scrapped Text from "+URLsToCheck[j]+"\n")
		if(compareContent.check(contentline)):
			# print("A Plag Found!!!...\n")
			plagflag+=1
			break

plagper = (plagflag/linecount)*100
# print("Percentage Plagiarised = "+ str(plagper) +"%\n")
print(str(plagper))
# print("Percentage Unique = "+ str(100-plagper) +"%\n\n")