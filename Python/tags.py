import os
import subprocess
path = "/home/nascarsayan/Music/Japanese/OST/"
f_ls = subprocess.check_output("find " + path + " -type f", shell = True).split("\n")
for f in f_ls:
    os.system('mid3v2 -v --TCON "Anime" ' + str(f))
