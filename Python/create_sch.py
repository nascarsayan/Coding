import os
path = "/home/nascarsayan/Coding/C/InterIIT/db/sports/"
sp_ls = ["badminton", "basketball", "football", "hockey", "lawn_tennis", "squash", "table_tennis", "volleyball", "water_polo"]
for sp in sp_ls:
    os.system("cat " + "/home/nascarsayan/temp/schedule.txt > " + path + str(sp) + "/schedule.txt")
