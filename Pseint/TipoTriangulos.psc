Algoritmo  TipoDeTriangulo
    Definir a, b, c Como Entero
	
    Escribir "Ingrese el lado a:"
    Leer a
    Escribir "Ingrese el lado b:"
    Leer b
    Escribir "Ingrese el lado c:"
    Leer c
	
    Si (a + b > c) Y (a + c > b) Y (b + c > a) Entonces
        // Es un tri�ngulo
        Si (a = b) Y (b = c) Entonces
            Escribir "Es un tri�ngulo equil�tero"
        Sino
            Si (a = b) O (a = c) O (b = c) Entonces
                Escribir "Es un tri�ngulo is�sceles"
            Sino
                Escribir "Es un tri�ngulo escaleno"
            FinSi
        FinSi
    Sino
        Escribir "No es un tri�ngulo v�lido"
    FinSi
FinAlgoritmo

