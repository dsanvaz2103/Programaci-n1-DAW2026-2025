package UD8.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Crear e inicializar la lista
        List<String> nombres = new ArrayList<>();

        // 2. Añadir 5 nombres iniciales
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Elena");
        nombres.add("Diego");
        nombres.add("Beatriz");

        System.out.println("--- Lista Inicial ---");
        mostrarNombres(nombres);

        // 3. Añadir un nuevo nombre por teclado
        System.out.print("\nIntroduce un nuevo nombre para añadir: ");
        String nuevoNombre = scanner.nextLine();
        nombres.add(nuevoNombre);

        // 4. Eliminar un nombre específico
        System.out.print("Introduce el nombre que deseas eliminar: ");
        String nombreAEliminar = scanner.nextLine();

        if (nombres.remove(nombreAEliminar)) {
            System.out.println("El nombre '" + nombreAEliminar + "' ha sido eliminado.");
        } else {
            System.out.println("El nombre '" + nombreAEliminar + "' no se encuentra en la lista.");
        }

        // 5. Mostrar la lista actualizada y el tamaño total
        System.out.println("\n--- Lista Actualizada ---");
        mostrarNombres(nombres);

        System.out.println("\nTotal de nombres en la lista: " + nombres.size());

        scanner.close();
    }


    public static void mostrarNombres(List<String> lista) {
        for (String nombre : lista) {
            System.out.println("- " + nombre);
        }
    }
}