# Programa 5: Login mejorado

# Establecer el usuario correcto
usuarioCorrecto = "admin"

# Entrada de datos
usuario = input("Por favor, introduce tu nombre de usuario: ")

# Verificar el usuario
if usuario == usuarioCorrecto:
    print("¡Bienvenido", usuario + "!")
else:
    print("Usuario incorrecto")
