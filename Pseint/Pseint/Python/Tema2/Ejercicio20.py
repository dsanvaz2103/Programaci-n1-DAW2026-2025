# 1. Crear el array original
original = [1, 2, 3, 4, 5]

# 2. Crear las copias
copia1 = original.copy()      # usando copy()
copia2 = original[:]          # usando slicing
copia3 = []                   # creamos una lista vacía
for x in original:            # recorremos cada elemento de 'original'
    copia3.append(x)          # agregamos ese elemento a 'copia3'


copia4 = original             # asignación directa (misma referencia)

# 3. Modificar copia4 y copia3
copia4.pop()   # eliminar el último elemento
copia3.pop(0)  # eliminar el primer elemento

# 4. Mostrar los resultados
print("original:", original)
print("copia1:", copia1)
print("copia2:", copia2)
print("copia3:", copia3)
print("copia4:", copia4)

# 5. Comparar los arrays (usando el mismo principio del Ejercicio 17)
def comparar_listas(lista1, lista2):
    return lista1 == lista2

print("\nComparaciones:")
print("original vs copia1:", comparar_listas(original, copia1))
print("original vs copia2:", comparar_listas(original, copia2))
print("original vs copia3:", comparar_listas(original, copia3))
print("original vs copia4:", comparar_listas(original, copia4))
