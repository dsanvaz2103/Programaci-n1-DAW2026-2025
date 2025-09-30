Algoritmo EjercicioAmpliación
	Definir n, m Como Entero
	Escribir "Introduce el primer número"
	Leer n
	Escribir "Introduce el segundo número"
	Leer m
	
	Mientras  n <> 0 y m <> 0 Hacer
		Si n > m Entonces
			n = n - m
		SiNo
			m = m - n 
		FinSi
	FinMientras
FinAlgoritmo
