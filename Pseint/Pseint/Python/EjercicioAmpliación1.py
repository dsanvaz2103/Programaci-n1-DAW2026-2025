# Pedimos los números al usuario
n = int(input("Introduce el primer número: "))
m = int(input("Introduce el segundo número: "))


# Algoritmo de Euclides con restas sucesivas
while n != 0 and m != 0:
    if n > m:
        n = n - m
    else:
        m = m - n

# Cuando uno llega a 0, el otro es el MCD
print("El MCD es:", max(n, m))
