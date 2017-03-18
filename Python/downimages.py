import os
import subprocess
os.chdir("/home/nascarsayan/Pictures/MusicCoverArt/Album/")
path = "/home/nascarsayan/Music/Japanese/src/"
f_ls = subprocess.check_output("ls " + path, shell = True).split("\n")
f_ls.pop(-1)
for f in f_ls:
    os.system("googliser " + "-p " + '"' + str(f).replace("_", " ") + " Anime Cover" + '" '+ "-i " + '"' + str(f).replace("_", " ") + '"' + " -n 4")
