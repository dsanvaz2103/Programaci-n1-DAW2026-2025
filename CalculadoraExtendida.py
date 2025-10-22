print("Calculadora Extendida")
print("1. Suma")
print("2. Resta")
print("3. Multiplicación")
print("4. División")
print("5. Máximo Común Divisor")

opcion = int(input("Seleccione una opción (1-5): "))

num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el segundo número: "))

if opcion == 1:
    print("La suma es:", num1 + num2)
elif opcion == 2:
    print("La resta es:", num1 - num2)
elif opcion == 3:
    print("La multiplicación es:", num1 * num2)
elif opcion == 4:
    if num2 != 0:
        print("La división es:", num1 / num2)
    else:
        print("Error: No se puede dividir entre cero")
elif opcion == 5:
    a = abs(num1)
    b = abs(num2)
    while a != 0 and b != 0:
        if a > b:
            a = a - b
        else:
            b = b - a
    print("El MCD es:", max(a, b))
else:
    print("Opción no válida")

