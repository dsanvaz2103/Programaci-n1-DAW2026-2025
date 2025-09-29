Algoritmo  TipoDeTriangulo
    Definir a, b, c Como Entero
	
    Escribir "Ingrese el lado a:"
    Leer a
    Escribir "Ingrese el lado b:"
    Leer b
    Escribir "Ingrese el lado c:"
    Leer c
	
    Si (a + b > c) Y (a + c > b) Y (b + c > a) Entonces
        // Es un triángulo
        Si (a = b) Y (b = c) Entonces
            Escribir "Es un triángulo equilátero"
        Sino
            Si (a = b) O (a = c) O (b = c) Entonces
                Escribir "Es un triángulo isósceles"
            Sino
                Escribir "Es un triángulo escaleno"
            FinSi
        FinSi
    Sino
        Escribir "No es un triángulo válido"
    FinSi
FinAlgoritmo

