import os
import subprocess
name_dir = "/home/nascarsayan/Music/Japanese/best_links/"
work_dir = "/media/nascarsayan/ArimaKousei/Music/Japanese/"
src_dir = work_dir + "src/"
dest_dir = work_dir + "best_links/"
name_ls = subprocess.check_output("ls " + name_dir , shell = True).split("\n")
name_ls.pop(-1)
print len(name_ls)
for name in name_ls:
    f = subprocess.check_output("find " + src_dir + " -name '" + str(name) + "' -printf" + ' "%p"', shell = True)
    os.system("mv " + str(f) + " " + dest_dir)
