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


# Ejemplo de uso
numeros = [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
buscar = 23

indice = busqueda_binaria(numeros, buscar)

if indice != -1:
    print(f"El número {buscar} se encuentra en el índice: {indice}")
else:
    print(f"El número {buscar} no se encuentra en la lista.")
