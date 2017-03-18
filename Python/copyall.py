import os
import subprocess
path = "/home/nascarsayan/Music/"
src = path + "Jap/"
tget = path + "Japanese/src/"
dir_ls = subprocess.check_output("ls " + src, shell = True).split("\n")
dir_ls.pop(-1)
dir_ls.remove("Best")
dir_ls.remove("OST")
dir_ls.remove("best_jap.xspf")
for dirt in dir_ls:
    f_ls = subprocess.check_output("ls " + src + str(dirt), shell = True).split("\n")
    f_ls.pop(-1)
    for f in f_ls:
        os.system("cp " + src + str(dirt) + "/" + str(f) + " " + tget)
