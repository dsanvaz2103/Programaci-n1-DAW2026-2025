a = [1,2,3,4,5,6,7,8,9,10]

for i in range(len(a) - 1, -1, -1): 
    if a[i] % 2 == 0:
        a.remove(a[i])

print(a)
