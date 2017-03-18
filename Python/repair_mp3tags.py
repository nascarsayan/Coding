import os
import subprocess
path = "/home/nascarsayan/Music/Japanese/OST/"
dir_ls = subprocess.check_output("ls " + path, shell = True).split("\n")
dir_ls.pop(-1)
print dir_ls
for d in dir_ls:
    f_ls = subprocess.check_output("ls " + path + str(d), shell = True).split("\n")
    f_ls.pop(-1)
    for f in f_ls:
        os.system('mid3v2 -v --TENC "nascarsayan" ' + path + str(d) + "/" + str(f))
