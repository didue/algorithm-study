from sys import stdin
def chkSum(idx):
    res = 0
    if idx < 100:
        return idx
    res = 99
    for i in range (100, idx+1):
        if((int(str(i)[2]) - int(str(i)[1])) == (int(str(i)[1]) - int(str(i)[0]))):
            res = res + 1
    return res
idx = int(stdin.readline())
print(chkSum(idx))