# Programa 9: Año bisiesto

# Entrada de datos
anio = int(input("Introduce un año: "))

# Verificar si es bisiesto
if anio % 4 == 0:
    if (anio % 100 != 0) or (anio % 400 == 0):
        print("El año", anio, "es bisiesto")
    else:
        print("El año", anio, "no es bisiesto")
else:
    print("El año", anio, "no es bisiesto")
