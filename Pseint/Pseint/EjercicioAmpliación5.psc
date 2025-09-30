Algoritmo CalculadoraExtendidaSimple
    Definir num1, num2, resultado Como Real
    Definir opcion, formato, decimales Como Entero
    Definir a, b Como Entero
	
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
	
    Escribir "Formato de resultado:"
    Escribir "1. Redondeado (entero)"
    Escribir "2. Con decimales"
    Escribir "Seleccione una opción (1-2): "
    Leer formato
	
    Si formato = 2 Entonces
        Escribir "¿Cuántos decimales desea?: "
        Leer decimales
    FinSi
	
    // Operaciones
    Si opcion = 1 Entonces
        resultado <- num1 + num2
    SiNo
        Si opcion = 2 Entonces
            resultado <- num1 - num2
        SiNo
            Si opcion = 3 Entonces
                resultado <- num1 * num2
            SiNo
                Si opcion = 4 Entonces
                    Si num2 <> 0 Entonces
                        resultado <- num1 / num2
                    SiNo
                        Escribir "Error: No se puede dividir entre cero"
                    FinSi
                SiNo
                    Si opcion = 5 Entonces
                        a <- num1
                        b <- num2
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
                    SiNo
                        Escribir "Opción no válida"
                    FinSi
                FinSi
            FinSi
        FinSi
    FinSi
	
    // Mostrar resultado
    Si resultado <> 0 Entonces
        Si formato = 1 Entonces
            resultado <- resultado - (resultado % 1)  // redondeo simple truncando decimales
            Escribir "Resultado redondeado: ", resultado
        SiNo
            // Redondeo a los decimales deseados
            multiplicador <- 1
            Para i <- 1 Hasta decimales Hacer
                multiplicador <- multiplicador * 10
            FinPara
            resultado <- (resultado * multiplicador) - ((resultado * multiplicador) % 1)
            resultado <- resultado / multiplicador
            Escribir "Resultado con decimales: ", resultado
        FinSi
    FinSi
FinAlgoritmo
