#plag-check using first 3 urls...accurate but slow a bit...
import getURL3
import webSearch
import comparefuzzy

content = open("fileInputContent.txt","r+")	#user data importing...
matched = open("matchedSources.txt","w+")	#to write the matched sources or urls...
highlight = open("highlightedText.txt","w+")	#to write the text with plagiarised content marked...

linecount=0	#keeps a line count
plagper=0	#finds the plagiarism percentage
maxurl=None	#url with maximum matching

for contentline in content:	#going through each line in the user data

	if(contentline!="\n"):	#get rid of unrequired lines read
		
		linecount+=1

		URLsToCheck = [None]*3	#For checking first 3 URLs
		URLsToCheck = getURL3.URLFinder(contentline)
		
		maxval=0	#a flag variable

		for j in range(3):	#for all 3 urls
			if(URLsToCheck[j]!=None):
				webSearch.searchResults(URLsToCheck[j])
				tempval = comparefuzzy.check(contentline)
				if(tempval>maxval):
					maxval = tempval
					maxurl = URLsToCheck[j]
					tempval = 0
			
		if(maxval>85):	#85%...a threshold value
			plagper += 100	#kept a threshold value of 85% as per the performance of the algo seen before

			matched.write("Line-"+str(linecount)+"::"+maxurl+"\n")	#writing for matched sources
			highlight.write("<font color=\"red\"><b>"+contentline+"</b></font>\n")	#writing for highlighting
		else:
			plagper += maxval

			highlight.write(contentline)	#writing non-highlighted

plagper /= linecount	#getting the percentage
print(str(plagper))	#print the result
#closing the streams...
highlight.close()
matched.close()
content.close()