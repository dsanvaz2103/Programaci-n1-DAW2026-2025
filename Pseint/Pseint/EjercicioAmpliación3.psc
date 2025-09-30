Algoritmo Fibonacci
    Definir N, i, a, b, siguiente Como Entero
	
    Escribir "Introduce la cantidad de términos: "
    Leer N
	
    a <- 0
    b <- 1
	
    Para i <- 1 Hasta N Hacer
        Escribir a
        siguiente <- a + b
        a <- b
        b <- siguiente
    FinPara
FinAlgoritmo
