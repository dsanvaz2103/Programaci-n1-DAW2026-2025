n = int(input("Introduce la cantidad de términos: "))

a, b = 0, 1

for i in range(n):
    print(a)
    a, b = b, a + b
