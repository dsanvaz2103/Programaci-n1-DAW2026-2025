// Programa 5: Login mejorado
Algoritmo LoginMejorado
    // Declaraci�n de variables
	Definir usuario, usuarioCorrecto Como Cadena;
    
    // Establecer el usuario correcto
    usuarioCorrecto = "admin"
    
    // Entrada de datos
    Escribir "Por favor, introduce tu nombre de usuario: "
    Leer usuario
    
    // Verificar el usuario
    Si usuario = usuarioCorrecto Entonces
        Escribir "�Bienvenido ", usuario, "!"
    SiNo
        Escribir "Usuario incorrecto"
    FinSi
FinAlgoritmo