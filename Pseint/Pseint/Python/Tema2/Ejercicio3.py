# a = [1,2,3,4]
# for i in range(5):
    # print(a[i])

# Lo mejoraria primero quitando el rango 5 ya que no estaria
# leyendolo bien ya que realmente estaria leyendo 5 posiciones
# es decir empezaria en 0,1,2,3,4 y realmente seria 0,1,2,3
# por lo que seria en vez de 5 seria 4 o utilizamos el (len)
# para asi que te lo recorra hasta la ultima posicon del array
# ahorrandonos asi tener fallos y que sea mas espacifica

a = [1,2,3,4]
for i in range(len(a)):
    print(a[i])