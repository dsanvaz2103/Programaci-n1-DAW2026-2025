// Programa 6: Mayor o menor
Algoritmo MayorOMenor
    // Declaraci�n de variables
	Definir num1, num2 Como Entero;
    
    // Entrada de datos
    Escribir "Introduce el primer n�mero: "
    Leer num1
    
    Escribir "Introduce el segundo n�mero: "
    Leer num2
    
    // Comparaci�n de n�meros
    Si num1 > num2 Entonces
        Escribir "El mayor es: ", num1
    SiNo
        Si num1 < num2 Entonces
            Escribir "El mayor es: ", num2
        SiNo
            Escribir "Los n�meros son iguales"
        FinSi
    FinSi
FinAlgoritmo
