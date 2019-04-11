try: 
	from googlesearch import search 
except ImportError:  
	pass 

def URLFinder(line):
	i=0
	URLs = None
	for j in search(line, tld="co.in", num=10, stop=1, pause=1): 
		URLs = j
		i = i+1
	return URLs