import re
# Definimos los colores
ROJO = "\033[91m"
VERDE = "\033[92m"
ORIGINAL = "\033[0m"
# Creamos la lista
lista = [
    [1, "Portatil", 12],
    [2, "Logitech G23", 50],
    [3, "Teclado Razer", 23],
    [4, "Monitor M24", 8],
    [5, "Cámara", 15],
    [6, "Ratón Gamer Corsair 2", 30],
    [7, "Auriculares HyperX 3.0", 20],
    [8, "SSD 1TB", 25],
    [9, "Placa Base MSI 255", 10]
]


# Función de búsqueda por ID
def buscar_por_id():
    try:
        id_buscar = int(input("Ingrese el ID del producto: "))
    except ValueError:
        print(ROJO + "Error: Debe ingresar un número entero." + ORIGINAL) # El reset del final es para volver a poner el color original
        return

    encontrado = False
    for producto in lista:
        if producto[0] == id_buscar:
            print(VERDE + f"Producto encontrado: {producto[1]} | Stock: {producto[2]}" + ORIGINAL)
            encontrado = True
            break

    if not encontrado:
        print(ROJO + "Error: No existe un producto con ese ID." + ORIGINAL)

# Función para comparar stock (mayor y menor)
def comparar_stock():
    mayor = lista[0]
    menor = lista[0]

    for producto in lista:
        if producto[2] > mayor[2]:
            mayor = producto
        if producto[2] < menor[2]:
            menor = producto

    print(VERDE + "\nProducto con mayor stock:" + ORIGINAL)
    print(f"- {mayor[1]} ({mayor[2]} unidades)")

    print(ROJO + "\nProducto con menor stock:" + ORIGINAL)
    print(f"- {menor[1]} ({menor[2]} unidades)")

# Función de validación de nombres de la lista
def validar_nombres_lista():
    print("\nValidando:")

    for producto in lista:
        nombre = producto[1]
        errores = []

        # Regla 1: Empieza con mayúscula
        if not re.match(r"^[A-Z]", nombre):
            errores.append("No empieza con mayúscula.")

        # Regla 2: Contiene al menos un dígito
        if not re.search(r"\d", nombre):
            errores.append("No contiene ningún número.")

        # Regla 3: Longitud entre 5 y 20
        if not (5 <= len(nombre) <= 20):
            errores.append("La longitud debe ser de 5 a 20 caracteres.")

        # Resultado
        if len(errores) == 0:
            print(VERDE + f"Nombre válido: {nombre}" + ORIGINAL)
        else:
            print(ROJO + f"Nombre inválido: {nombre}" + ORIGINAL)
            for err in errores:
                print(ROJO + f"- {err}" + ORIGINAL)

# Menú principal
def menu():
    
    while True:
        print("\n============== MENÚ ==============")
        print("1. Buscar producto por ID")
        print("2. Mostrar producto con mayor y menor stock")
        print("3. Validar nombres de productos")
        print("4. Salir")
        print("==================================")

        opcion = input("Seleccione una opción: ")

        if opcion == "1":
            buscar_por_id()
        elif opcion == "2":
            comparar_stock()
        elif opcion == "3":
            validar_nombres_lista()
        elif opcion == "4":
            print("Saliendo del programa...")
            break
        else:
            print(RED + "Opción inválida." + ORIGINAL)

# Ejecutar menú
menu()
