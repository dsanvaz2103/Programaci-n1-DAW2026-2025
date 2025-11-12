def comparar_listas(lista1, lista2):
    if len(lista1) != len(lista2):
        print("Las listas tienen diferente longitud.")
    else:
        if lista1 == lista2:
            print("Las listas son exactamente iguales.")
        elif set(lista1) == set(lista2):
            print("Tienen los mismos valores pero en diferente orden.")
        else:
            print("Las listas tienen diferentes valores.")


# Pruebas de los cuatro casos
print("Caso 1: Listas iguales")
comparar_listas([1, 2, 3], [1, 2, 3])

print("\nCaso 2: Diferente longitud")
comparar_listas([1, 2, 3], [1, 2, 3, 4])

print("\nCaso 3: Diferentes valores")
comparar_listas([1, 2, 3], [1, 4, 3])

print("\nCaso 4: Mismos valores, diferente orden")
comparar_listas([1, 2, 3], [3, 2, 1])
