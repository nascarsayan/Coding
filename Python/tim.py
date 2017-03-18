import time
import math
while (True):
    try:
        t = int(raw_input())
        k = t
        while (True):
            l = math.sqrt(k)
            print l
            if int(l + 0.5) ** 2 == k:
                break
            k = k + 4000000007
        print time.strftime('%a %b %d %H:%M:%S %Y', time.gmtime(k)), k
    except:
        print "fd"
        break
