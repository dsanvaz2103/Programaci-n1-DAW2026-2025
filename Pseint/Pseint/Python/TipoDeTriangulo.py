# Programa: Tipo de triángulo

# Entrada de lados
a = int(input("Ingrese el lado a: "))
b = int(input("Ingrese el lado b: "))
c = int(input("Ingrese el lado c: "))

# Verificar si es un triángulo válido
if (a + b > c) and (a + c > b) and (b + c > a):
    # Es un triángulo
    if a == b == c:
        print("Es un triángulo equilátero")
    elif a == b or a == c or b == c:
        print("Es un triángulo isósceles")
    else:
        print("Es un triángulo escaleno")
else:
    print("No es un triángulo válido")
