// Programa 9: A�o bisiesto
Algoritmo A�oBisiesto
    // Declaraci�n de variables
	Definir anio Como Entero;
    
    // Entrada de datos
    Escribir "Introduce un a�o: "
    Leer anio
    
    // Verificar si es bisiesto
    Si (a�o MOD 4 = 0) Entonces
        Si ((a�o MOD 100 = 0) y (a�o MOD 400 = 0)) o ((a�o MOD 100 <> 0)) Entonces
            Escribir "El a�o ", a�o, " es bisiesto"
        SiNo
            Escribir "El a�o ", a�o, " no es bisiesto"
        FinSi
    SiNo
        Escribir "El a�o ", a�o, " no es bisiesto"
    FinSi
FinAlgoritmo