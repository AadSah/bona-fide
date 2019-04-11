from fuzzywuzzy import fuzz
# from fuzzywuzzy import process

def check(content):
    maximum=0
    with open("extractedTextFromURL.txt") as f:
        datafile = f.readlines()
    for line in datafile:
        # temp = fuzz.token_sort_ratio(content,line)
        # temp = fuzz.partial_ratio(content,line)
        temp = fuzz.token_set_ratio(content,line)
        if (temp > maximum) :
            maximum = temp
            temp = 0
    return maximum