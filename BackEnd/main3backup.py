#plag-check using first 3 urls...accurate but slow a bit...
import getURL3
import webSearch
# import compareContent
import comparefuzzy

content = open("fileInputContent.txt","r+")
# matched = open("matchedSources.txt","w+")
linecount=0
# plagflag=0
plagper=0

for contentline in content:
	if(contentline!="\n"):
		linecount+=1

		URLsToCheck = [None]*3	#For checking first 3 URLs
		# URLsToCheck = None
		URLsToCheck = getURL3.URLFinder(contentline)
		maxval=0
		for j in range(3):
			if(URLsToCheck[j]!=None):
		# if(URLsToCheck!=None):
			# print("Checking: "+URLsToCheck[j]+"\n")
				webSearch.searchResults(URLsToCheck[j])
			# webSearch.searchResults(URLsToCheck)
			# print("Scrapped Text from "+URLsToCheck[j]+"\n")
			tempval = comparefuzzy.check(contentline)
			if(tempval>maxval):
				maxval = tempval
				tempval=0
		# 	# print("A Plag Found!!!...\n")
		# 	plagflag+=1
		# 	break
		if(maxval>85):	#85%...a threshold value
			plagper+=100
		else:
			plagper += maxval
plagper /= linecount
# plagper *= 100
# print("Percentage Plagiarised = "+ str(plagper) +"%\n")
print(str(plagper))
# print("Percentage Unique = "+ str(100-plagper) +"%\n\n")
content.close()