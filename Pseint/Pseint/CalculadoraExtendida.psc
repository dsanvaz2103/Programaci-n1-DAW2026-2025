Algoritmo CalculadoraExtendida
    Definir num1, num2, opcion, resultado, a, b Como Entero
	
    Escribir "Calculadora Extendida"
    Escribir "1. Suma"
    Escribir "2. Resta"
    Escribir "3. Multiplicación"
    Escribir "4. División"
    Escribir "5. Máximo Común Divisor"
    Escribir "Seleccione una opción (1-5): "
    Leer opcion
	
    Escribir "Introduce el primer número: "
    Leer num1
    Escribir "Introduce el segundo número: "
    Leer num2
	
    Segun opcion Hacer
        1:
            resultado <- num1 + num2
            Escribir "La suma es: ", resultado
        2:
            resultado <- num1 - num2
            Escribir "La resta es: ", resultado
        3:
            resultado <- num1 * num2
            Escribir "La multiplicación es: ", resultado
        4:
            Si num2 <> 0 Entonces
                resultado <- num1 / num2
                Escribir "La división es: ", resultado
            SiNo
                Escribir "Error: No se puede dividir entre cero"
            FinSi
        5:
            a <- abs(num1)
            b <- abs(num2)
            Mientras a <> 0 Y b <> 0 Hacer
                Si a > b Entonces
                    a <- a - b
                SiNo
                    b <- b - a
                FinSi
            FinMientras
            resultado <- a
            Si b > a Entonces
                resultado <- b
            FinSi
            Escribir "El MCD es: ", resultado
        DeOtros:
            Escribir "Opción no válida"
    FinSegun
FinAlgoritmo
