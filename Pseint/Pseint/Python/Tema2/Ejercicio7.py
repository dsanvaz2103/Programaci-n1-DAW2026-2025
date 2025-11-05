def numeroMaximo (t):
    maximo = t[0];
    for i in range(len(t)):
        maximo = i
        if(i > maximo):
            print(maximo , " es el mayor")
        else:
            print("No se a encontrado un mayor")
        
        
numero = [1,2,3,45,44]
print(numeroMaximo(numero))