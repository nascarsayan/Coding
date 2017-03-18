import os

def mksports(sp_ls, path):
    os.chdir(path)
    for sp in sp_ls:
        os.system("mkdir " + str(sp))
        os.system("touch " + str(sp) + "/schedule.txt " + str(sp) + "/scoreboard.txt")

def mkentities(en_ls, path):
    os.chdir(path)
    for en in en_ls:
        os.system("mkdir " + str(en))

def mkorganiser(path):
    os.chdir(path)
    os.system("touch " + "log_info " + "scorebd_update.txt " + "player_kit.txt " + "complaints.txt")

def mkteams(sp_ls, iits, path):
    os.chdir(path)
    for sp in sp_ls:
        os.system("mkdir " + str(sp))
        for iit in iits:
            os.system("mkdir " + str(sp) + "/IIT" + str(iit))
            os.system("touch " + str(sp) + "/IIT" + str(iit) + "/log_info.txt")

def mkofficial(path):
    os.chdir(path)
    os.system("touch " + "log_details.txt " + "scoreboard.txt")

def mkmanager(iits, path):
    os.chdir(path)
    for iit in iits:
        os.system("mkdir IIT" + str(iit))
        os.system("touch IIT" + str(iit) + "/" + "log_info.txt IIT" + str(iit) + "/" + "complaints.txt")

def mkothers(path):
    os.chdir(path)
    os.system("touch " + "log_info.txt")

sp_ls = ["athletics", "badminton", "basketball", "cricket", "football", "hockey", "lawn_tennis", "squash", "swimming", "table_tennis", "volleyball", "water_polo", "weightlifting"]
en_ls = ["organiser", "teams", "match_official", "team_managers", "others"]
iits = ["B", "D", "G", "K", "Kgp", "M", "R"]
path = "/home/nascarsayan/Coding/C/InterIIT/db/"
mksports(sp_ls, path + "sports/")
mkentities(en_ls, path + "entities/")
mkorganiser(path + "entities/organiser/")
mkteams(sp_ls, iits, path + "entities/teams/")
mkofficial(path + "entities/match_official/")
mkmanager(iits, path + "entities/team_managers/")
mkothers(path + "entities/others/")
