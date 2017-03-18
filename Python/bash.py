import os
f = open("../bash/jap_best.txt").read()
paths = f.split("\n")
for i in paths:
    fname = i.split("/").pop(-1)
    os.system("cp " + str(i) + " ~/Music/Japanese/Best2/" + str(fname))
