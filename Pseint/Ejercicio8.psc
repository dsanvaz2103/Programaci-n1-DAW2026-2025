// Programa 8: Calculadora básica
Algoritmo CalculadoraBasica
    // Declaración de variables
	Definir num1, num2, resultado Como Real;
	Definir opcion Como Entero;
    // Menú de opciones
    Escribir "Calculadora Básica"
    Escribir "1. Suma"
    Escribir "2. Resta"
    Escribir "3. Multiplicación"
    Escribir "4. División"
    Escribir "Seleccione una opción (1-4): "
    Leer opcion
    
    // Entrada de números
    Escribir "Introduce el primer número: "
    Leer num1
    
    Escribir "Introduce el segundo número: "
    Leer num2
    
    // Realizar la operación seleccionada
    Segun opcion Hacer
        1:
            resultado = num1 + num2
            Escribir "La suma es: ", resultado
        2:
            resultado = num1 - num2
            Escribir "La resta es: ", resultado
        3:
            resultado = num1 * num2
            Escribir "La multiplicación es: ", resultado
        4:
            Si num2 <> 0 Entonces
                resultado = num1 / num2
                Escribir "La división es: ", resultado
            SiNo
                Escribir "Error: No se puede dividir entre cero"
            FinSi
        DeOtros:
            Escribir "Opción no válida"
    FinSegun
FinAlgoritmo