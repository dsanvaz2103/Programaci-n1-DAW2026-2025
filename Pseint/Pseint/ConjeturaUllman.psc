Algoritmo ConjeturaUllman
    Definir n Como Entero
	
    Escribir "Introduce un número entero mayor que 1: "
    Leer n
	
    Mientras n <> 1 Hacer
        Escribir n
        Si n % 2 = 0 Entonces
            n <- n / 2
        SiNo
            n <- 3 * n + 1
        FinSi
    FinMientras
	
    Escribir 1
FinAlgoritmo