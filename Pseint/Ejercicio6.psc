// Programa 6: Mayor o menor
Algoritmo MayorOMenor
    // Declaración de variables
	Definir num1, num2 Como Entero;
    
    // Entrada de datos
    Escribir "Introduce el primer número: "
    Leer num1
    
    Escribir "Introduce el segundo número: "
    Leer num2
    
    // Comparación de números
    Si num1 > num2 Entonces
        Escribir "El mayor es: ", num1
    SiNo
        Si num1 < num2 Entonces
            Escribir "El mayor es: ", num2
        SiNo
            Escribir "Los números son iguales"
        FinSi
    FinSi
FinAlgoritmo
