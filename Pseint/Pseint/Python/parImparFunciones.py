def parimpar(num1):
    if(num1 % 2 == 0):
        return print(num1 , " Es par ")
    else:
        return print(num1 , " Es impar ")
    
numero = int(input("Introduce el numero: "))
resultado = parimpar(numero)
