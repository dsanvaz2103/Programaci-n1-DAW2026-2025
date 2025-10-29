def maximo(t):
    mayor = t[0]
    for i in range(1, len(t)):
        if t[i] > mayor:
            mayor = t[i]
    return mayor

numeros = [4, 12, 7, 3, 9]
print("El valor máximo es:", maximo(numeros))
