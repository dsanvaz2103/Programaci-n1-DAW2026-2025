SubProceso ParImpar(num1)
    Si num1 MOD 2 = 0 Entonces
        Escribir num1, " es par"
    Sino
        Escribir num1, " es impar"
    FinSi
FinSubProceso

Proceso Principal
    Definir numero Como Entero
	
    Escribir "Introduce el numero: "
    Leer numero
	
    ParImpar(numero)
FinProceso