# Lista original de tareas
tareas_dia = ["Revisar Email", "Llamar al cliente", "comprar café", "Actualizar reporte", "Planificar reunión"]

# Crear una nueva lista ordenada alfabéticamente ignorando mayúsculas/minúsculas
informe_ordenado = sorted(tareas_dia, key=str.lower)

# Imprimir el informe ordenado
print("Informe ordenado (vista temporal):")
print(informe_ordenado)

# Verificar que la lista original no cambió
print("\nLista original (sin cambios):")
print(tareas_dia)
