# Programa: Calificación

# Entrada de la nota
nota = float(input("Ingrese la nota (0-10): "))

# Clasificación de la nota
if 9 <= nota <= 10:
    print("Sobresaliente")
elif 7 <= nota < 9:
    print("Notable")
elif 6 <= nota < 7:
    print("Bien")
elif 5 <= nota < 6:
    print("Suficiente")
elif 0 <= nota < 5:
    print("Insuficiente")
else:
    print("Nota no válida")
