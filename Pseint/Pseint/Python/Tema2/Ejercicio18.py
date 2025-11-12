import random

# --- Función de búsqueda secuencial ---
def busqueda_lineal(lista, n):
    i = 0
    respuesta = -1
    while i < len(lista) and respuesta == -1:
        if lista[i] == n:
            respuesta = i
        i += 1
    return respuesta


# --- Función de búsqueda binaria ---
def busqueda_binaria(lista_ordenada, objetivo):
    inicio = 0
    fin = len(lista_ordenada) - 1

    while inicio <= fin:
        medio = (inicio + fin) // 2
        if lista_ordenada[medio] == objetivo:
            return medio
        elif lista_ordenada[medio] < objetivo:
            inicio = medio + 1
        else:
            fin = medio - 1
    return -1


# --- Crear un array con elementos desordenados ---
lista = [random.randint(1, 20) for _ in range(8)]
print("Lista original (desordenada):", lista)

# --- Escoger un número para buscar ---
n = int(input("Introduce un número a buscar: "))

# --- Buscar en la lista desordenada ---
resultado_lineal = busqueda_lineal(lista, n)
resultado_binaria = busqueda_binaria(lista, n)  # No funcionará bien en lista desordenada

print("\nResultados en la lista desordenada:")
print(f"Búsqueda lineal: {resultado_lineal}")
print(f"Búsqueda binaria (lista desordenada): {resultado_binaria} (no confiable sin ordenar)")

# --- Ordenar la lista ---
lista_ordenada = sorted(lista)
print("\nLista ordenada:", lista_ordenada)

# --- Volver a buscar con ambas funciones ---
resultado_lineal_ordenada = busqueda_lineal(lista_ordenada, n)
resultado_binaria_ordenada = busqueda_binaria(lista_ordenada, n)

print("\nResultados en la lista ordenada:")
print(f"Búsqueda lineal: {resultado_lineal_ordenada}")
print(f"Búsqueda binaria: {resultado_binaria_ordenada}")

# --- Comparación ---
print("\nComparación final:")
if resultado_lineal_ordenada == resultado_binaria_ordenada and resultado_lineal_ordenada != -1:
    print(f"Ambas búsquedas encontraron el número {n} correctamente en la lista ordenada.")
elif resultado_lineal_ordenada == -1:
    print(f"El número {n} no se encuentra en la lista (ni ordenada ni desordenada).")
else:
    print("Resultados diferentes: revisa que la lista esté correctamente ordenada antes de usar la búsqueda binaria.")
