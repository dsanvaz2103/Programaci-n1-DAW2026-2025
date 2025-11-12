# Crear el array original
original = [1, 2, 3, 4, 5]
print("Lista original:", original)

# Crear las copias
copia1 = original.copy()       # Método copy()
copia2 = original[:]           # Slicing
copia3 = [x for x in original] # Copia manual con comprensión de listas
copia4 = original              # Asignación directa (no crea una copia real)

# Mostrar todas las copias antes de modificar
print("\nCopias iniciales:")
print("copia1:", copia1)
print("copia2:", copia2)
print("copia3:", copia3)
print("copia4:", copia4)

# Eliminar elementos
copia4.pop()   # elimina el último elemento de copia4
copia3.pop(0)  # elimina el primer elemento de copia3

# Mostrar todas las listas después de eliminar
print("\nDespués de eliminar elementos:")
print("original:", original)
print("copia1:", copia1)
print("copia2:", copia2)
print("copia3:", copia3)
print("copia4:", copia4)
