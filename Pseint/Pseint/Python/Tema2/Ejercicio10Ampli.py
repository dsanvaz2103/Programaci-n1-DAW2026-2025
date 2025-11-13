def comparar_arrays(arr1, arr2, arr3):
    # Comprobar que las tres listas tienen la misma longitud
    if len(arr1) != len(arr2) or len(arr1) != len(arr3):
        return False
    
    # Comparar elemento por elemento ignorando mayúsculas/minúsculas
    for i in range(len(arr1)):
        if arr1[i].lower() != arr2[i].lower() or arr1[i].lower() != arr3[i].lower():
            return False
    
    return True

# Ejemplos de prueba
a = ['h','o','l','a']
b = ['H','o','l','a']
c = ['H','O','L','A']
print(comparar_arrays(a, b, c))  #True

a = ['h','o','l']
b = ['H','o','l','a']
c = ['H','O','L','A']
print(comparar_arrays(a, b, c))  #False

a = ['h','o','l','a']
b = ['H','o','l','a']
c = ['A','D','I','O']
print(comparar_arrays(a, b, c))  #False
