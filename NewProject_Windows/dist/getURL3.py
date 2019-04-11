try: 
	from googlesearch import search 
except ImportError:  
	pass 

def URLFinder(line):
	i=0
	URLs = [None]*3
	for j in search(line, tld="com", num=10, stop=3, pause=1): 
		URLs[i] = j
		i = i+1
	return URLs