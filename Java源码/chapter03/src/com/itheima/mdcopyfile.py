import os
s = os.listdir(".")
for i in s:
    if i.endswith(".java"):
        name = i[:len(i)-5]
        os.system("md "+name)
        os.system("move " + i  + " " + name)
