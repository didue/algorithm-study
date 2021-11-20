import sys
num1, num2 = map(list, (sys.stdin.readline().rstrip().split(" ")))
num1.reverse()
num2.reverse()
if "". join(num1) > "". join(num2):
    print("". join(num1))
else:
    print("". join(num2))
