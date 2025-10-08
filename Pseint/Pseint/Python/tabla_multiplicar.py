numero = int(input("Ingresa un número del 1 al 10: "))


while numero < 1 or numero > 10:
    print("Número inválido. Intenta de nuevo.")
    numero = int(input("Ingresa un número del 1 al 10: "))

print(f"Tabla de multiplicar del {numero}:")
for i in range(1, 11):
    print(f"{numero} x {i} = {numero * i}")
