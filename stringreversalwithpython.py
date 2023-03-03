def stringreverse(para:str):
    if(len(para) == 0):
        return ""

    return stringreverse(para[1:])+para[0]

para = input('Enter your paragraph: ').split()
newString = ""
for i in para: 
    newString += stringreverse(i) + " "

print(newString.strip())