// Programa 4: Login
Algoritmo Login
    // Declaración de variables
	Definir usuario , usuarioCorrecto Como Cadena;
    
    // Establecer el usuario correcto
    usuarioCorrecto = "admin"
    
    // Entrada de datos
    Escribir "Por favor, introduce tu nombre de usuario: "
    Leer usuario
    
    // Verificar el usuario
    Si usuario = usuarioCorrecto Entonces
        Escribir "¡Bienvenido ", usuario, "!"
    FinSi
FinAlgoritmo