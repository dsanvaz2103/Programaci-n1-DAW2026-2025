Algoritmo  Calificacion
    Definir nota Como Real
	
    Escribir "Ingrese la nota (0-10):"
    Leer nota
	
    Si nota >= 9 Y nota <= 10 Entonces
        Escribir "Sobresaliente"
    Sino
        Si nota >= 7 Y nota < 9 Entonces
            Escribir "Notable"
        Sino
            Si nota >= 6 Y nota < 7 Entonces
                Escribir "Bien"
            Sino
                Si nota >= 5 Y nota < 6 Entonces
                    Escribir "Suficiente"
                Sino
                    Si nota >= 0 Y nota < 5 Entonces
                        Escribir "Insuficiente"
                    Sino
                        Escribir "Nota no válida"
                    FinSi
                FinSi
            FinSi
        FinSi
    FinSi
FinAlgoritmo
