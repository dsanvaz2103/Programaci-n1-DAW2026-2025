print("Calculadora Extendida")
print("1. Suma")
print("2. Resta")
print("3. Multiplicación")
print("4. División")
print("5. Máximo Común Divisor")

opcion = int(input("Seleccione una opción (1-5): "))

num1 = float(input("Introduce el primer número: "))
num2 = float(input("Introduce el segundo número: "))

# Preguntamos formato de resultado
print("Formato de resultado:")
print("1. Redondeado (entero)")
print("2. Con decimales")
formato = int(input("Seleccione una opción (1-2): "))

decimales = 2  # valor por defecto
if formato == 2:
    decimales = int(input("¿Cuántos decimales desea?: "))

# Calculamos la operación
resultado = None

if opcion == 1:
    resultado = num1 + num2
elif opcion == 2:
    resultado = num1 - num2
elif opcion == 3:
    resultado = num1 * num2
elif opcion == 4:
    if num2 != 0:
        resultado = num1 / num2
    else:
        print("Error: No se puede dividir entre cero")
elif opcion == 5:
    a = int(abs(num1))
    b = int(abs(num2))
    while a != 0 and b != 0:
        if a > b:
            a = a - b
        else:
            b = b - a
    resultado = max(a, b)
else:
    print("Opción no válida")

# Mostramos el resultado según formato
if resultado is not None:
    if formato == 1:
        print("Resultado redondeado:", round(resultado))
    else:
        print("Resultado con decimales:", round(resultado, decimales))
