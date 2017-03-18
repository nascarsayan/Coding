import os
import subprocess
pat = "/media/nascarsayan/ArimaKousei/Music/Japanese/"
dup_list = subprocess.check_output("ls " + pat + "Best", shell = True).split("\n")
dir_list = subprocess.check_output("ls " + pat , shell = True).split("\n")
dup_list.pop(-1)
dir_list.pop(-1)
dir_list.remove('Best')
dir_list.remove('OST')
for dirt in dir_list:
    f_ls = subprocess.check_output("ls " + pat + str(dirt), shell = True).split("\n")
    for f in f_ls:
        if (f in dup_list):
            os.system("rm " + pat + str(dirt) + "/" + str(f))
