import os
import subprocess
path = "/home/nascarsayan/Knowledge/CS/"
f_ls = subprocess.check_output("find " + path + " -name '*ython*'", shell = True).split("\n")
f_ls.pop(-1)
for f in f_ls :
    os.system("mv " + str(f) + " " + path +"Python/")
