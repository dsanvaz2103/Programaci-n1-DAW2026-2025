Algoritmo AdivinaNumero
    Definir i, s, n Como Entero
	
    i <- 10
    s <- azar(100) + 1  // Número aleatorio entre 1 y 100
	
    Escribir "Introduce un número entre 1 y 100: "
    Leer n
	
    Mientras s <> n Y i > 1 Hacer
        Si s > n Entonces
            Escribir "Muy bajo"
        SiNo
            Escribir "Muy alto"
        FinSi
		
        i <- i - 1
        Escribir "Intentos restantes: ", i, ", Número ingresado: ", n
		
        Escribir "Introduce otro número: "
        Leer n
    FinMientras
	
    Si s = n Entonces
        Escribir "¡Exacto! Número ", s, " adivinado en ", 11 - i, " intentos"
    SiNo
        Escribir "Se acabaron los intentos. El número era: ", s
    FinSi
FinAlgoritmo
