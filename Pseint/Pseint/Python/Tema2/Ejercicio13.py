listaOriginal = [1,2,3,4,5,6,7,8,9,10]
listaActualizada = []

print("listaOriginal: " , listaOriginal)
for i in range(len(listaOriginal)):
    if i < 5:                      # mientras el índice sea menor que 5
        listaActualizada.append(listaOriginal[i])

print("listaActualizada: " , listaActualizada)
