// Programa 9: Año bisiesto
Algoritmo AñoBisiesto
    // Declaración de variables
	Definir anio Como Entero;
    
    // Entrada de datos
    Escribir "Introduce un año: "
    Leer anio
    
    // Verificar si es bisiesto
    Si (año MOD 4 = 0) Entonces
        Si ((año MOD 100 = 0) y (año MOD 400 = 0)) o ((año MOD 100 <> 0)) Entonces
            Escribir "El año ", año, " es bisiesto"
        SiNo
            Escribir "El año ", año, " no es bisiesto"
        FinSi
    SiNo
        Escribir "El año ", año, " no es bisiesto"
    FinSi
FinAlgoritmo