# Programa 8: Calculadora básica

# Menú de opciones
print("Calculadora Básica")
print("1. Suma")
print("2. Resta")
print("3. Multiplicación")
print("4. División")

opcion = int(input("Seleccione una opción (1-4): "))

# Entrada de números
num1 = float(input("Introduce el primer número: "))
num2 = float(input("Introduce el segundo número: "))

# Realizar la operación seleccionada
if opcion == 1:
    resultado = num1 + num2
    print("La suma es:", resultado)
elif opcion == 2:
    resultado = num1 - num2
    print("La resta es:", resultado)
elif opcion == 3:
    resultado = num1 * num2
    print("La multiplicación es:", resultado)
elif opcion == 4:
    if num2 != 0:
        resultado = num1 / num2
        print("La división es:", resultado)
    else:
        print("Error: No se puede dividir entre cero")
else:
    print("Opción no válida")
