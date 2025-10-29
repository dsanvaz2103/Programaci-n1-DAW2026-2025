# Creamos una lista de 5 elementos inicializados en 0
numeros = [0] * 5

# Pedimos los 5 números decimales
for i in range(5):
    numeros[i] = float(input(f"Introduzca el número decimal {i+1}: "))

# Mostramos los números en el mismo orden
print("\nLos números introducidos son:")
for i in range(5):
    print(numeros[i])
