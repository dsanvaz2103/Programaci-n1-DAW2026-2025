import random

# Método de búsqueda lineal
def busqueda_lineal(lista, n):
    i = 0
    respuesta = -1
    while i < len(lista) and respuesta == -1:
        if lista[i] == n:
            respuesta = i
        i = i + 1 
    return respuesta

# Crear un array con 5 números aleatorios entre 1 y 10
lista = [random.randint(1, 10) for _ in range(5)]
print("Lista generada:", lista)

# Pedir número al usuario
n = int(input("Introduce un número a buscar: "))

# Buscar con el método propio
resultado = busquedaLineal(lista, n)

# Buscar con el método index(), controlando el error si no está
try:
    resultado_index = lista.index(n)
except ValueError:
    resultado_index = -1

# Mostrar resultados
print("Resultado con busquedaLineal:", resultado)
print("Resultado con lista.index():", resultado_index)
