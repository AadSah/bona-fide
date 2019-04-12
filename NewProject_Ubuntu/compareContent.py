def check(content):
    
    with open("extractedTextFromURL.txt") as f:
        datafile = f.readlines()
 
    for line in datafile:
        if content in line:
            # print("A Plag Found!!!...\n")
            # print("Comparison DONE!!!...True\n")
            return True
    # print("Comparison DONE!!!...False\n")
    return False