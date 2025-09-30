Algoritmo AdivinaNumero
    Definir i, s, n Como Entero
	
    i <- 10
    s <- azar(100) + 1  // N�mero aleatorio entre 1 y 100
	
    Escribir "Introduce un n�mero entre 1 y 100: "
    Leer n
	
    Mientras s <> n Y i > 1 Hacer
        Si s > n Entonces
            Escribir "Muy bajo"
        SiNo
            Escribir "Muy alto"
        FinSi
		
        i <- i - 1
        Escribir "Intentos restantes: ", i, ", N�mero ingresado: ", n
		
        Escribir "Introduce otro n�mero: "
        Leer n
    FinMientras
	
    Si s = n Entonces
        Escribir "�Exacto! N�mero ", s, " adivinado en ", 11 - i, " intentos"
    SiNo
        Escribir "Se acabaron los intentos. El n�mero era: ", s
    FinSi
FinAlgoritmo
