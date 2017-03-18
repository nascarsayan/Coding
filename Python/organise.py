import os
import subprocess
path = "/home/nascarsayan/Music/Japanese/src/"
f_ls = subprocess.check_output("find " + path + " -maxdepth 1 -type f -printf '%f\n'", shell = True).split("\n")
f_ls.pop(-1)
f_ls = sorted(f_ls)
for f in f_ls :
    pair = f.split("_-_")
    dirt = str(pair[0])
    dir_ls = subprocess.check_output("find " + path + " -maxdepth 1 -type d -printf '%f\n'", shell = True).split("\n")
    dir_ls.pop(0)
    dir_ls.pop(-1)
    dest = path + str(dirt)
    mk_new = 0
    if not (dirt in dir_ls):
        mk_new = 1
        for d in dir_ls:
           if(str(d) in dirt):
               dest = path + str(d)
               mk_new = 0
               print "------------------------Change------------------"
               break
    if(mk_new == 1):
        os.system("mkdir " + path + dirt)
    os.system("mv " + path + str(f) +" " + dest)
