def suma(a, b):
    return a + b

def resta(a, b):
    return a - b

def multiplicacion(a, b):
    return a * b

def division(a, b):
    if b != 0:
        return a / b
    else:
        return None  # indicamos que no se puede dividir

def mcd(a, b):
    a, b = abs(a), abs(b)  # valores positivos
    while a != 0 and b != 0:
        if a > b:
            a = a - b
        else:
            b = b - a
    return max(a, b)

# -------- Programa principal --------
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
    print("La suma es:", suma(num1, num2))
elif opcion == 2:
    print("La resta es:", resta(num1, num2))
elif opcion == 3:
    print("La multiplicación es:", multiplicacion(num1, num2))
elif opcion == 4:
    resultado = division(num1, num2)
    if resultado is not None:
        print("La división es:", resultado)
    else:
        print("Error: No se puede dividir entre cero")
elif opcion == 5:
    print("El MCD es:", mcd(num1, num2))
else:
    print("Opción no válida")
