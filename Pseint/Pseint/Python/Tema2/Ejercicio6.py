cantidad = int(input("¿Cuantos numeros deseas introducir?: "))

numero = [0] * cantidad

for i in range(cantidad):
    numero[i] = int(input(f"Introduzca el numero {i+1}: "))

print("\nLos numeros en orden inverso son: ")
for i in reversed(numero):
    print(i)
