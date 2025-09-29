// Programa 8: Calculadora b�sica
Algoritmo CalculadoraBasica
    // Declaraci�n de variables
	Definir num1, num2, resultado Como Real;
	Definir opcion Como Entero;
    // Men� de opciones
    Escribir "Calculadora B�sica"
    Escribir "1. Suma"
    Escribir "2. Resta"
    Escribir "3. Multiplicaci�n"
    Escribir "4. Divisi�n"
    Escribir "Seleccione una opci�n (1-4): "
    Leer opcion
    
    // Entrada de n�meros
    Escribir "Introduce el primer n�mero: "
    Leer num1
    
    Escribir "Introduce el segundo n�mero: "
    Leer num2
    
    // Realizar la operaci�n seleccionada
    Segun opcion Hacer
        1:
            resultado = num1 + num2
            Escribir "La suma es: ", resultado
        2:
            resultado = num1 - num2
            Escribir "La resta es: ", resultado
        3:
            resultado = num1 * num2
            Escribir "La multiplicaci�n es: ", resultado
        4:
            Si num2 <> 0 Entonces
                resultado = num1 / num2
                Escribir "La divisi�n es: ", resultado
            SiNo
                Escribir "Error: No se puede dividir entre cero"
            FinSi
        DeOtros:
            Escribir "Opci�n no v�lida"
    FinSegun
FinAlgoritmo