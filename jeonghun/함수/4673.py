arr = [False for i in range(10036)]
def chkSelfNum(i):
	res = i
	if i >= 10000:
		res = res + i // 10000
		i = i % 10000
	if i >= 1000:
		res = res + i // 1000
		i = i % 1000
	if i >= 100:
		res = res + i // 100
		i = i % 100
	if i >= 10:
		res = res + i // 10
		i = i % 10; 
	return res + i
for i in range(1,10001):
	arr[chkSelfNum(i)] = 1
	if(not arr[i]):
		print(i)