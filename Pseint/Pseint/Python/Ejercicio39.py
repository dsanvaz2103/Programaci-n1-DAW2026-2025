a = input("Introduzca un numero para verificar si es primo")
if(a < 1):
    print(a + "No es primo")
if (a == 2):
        print(a + "Es primo")
else:
        i = 2
        while i < a:
            if(a%i == 0):
                print (a + " No Primo")
                break
if(i == a - 1):
    print(a + " Si es primo")
            
