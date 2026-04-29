package UD8.EjerciciosRefuerzo.Ejercicio6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iteradores {
    public static void main(String[] args) {
        // 1. Crear LinkedList con nombres
        LinkedList<String> nombres = new LinkedList<>(Arrays.asList(
                "Ana", "Roberto", "Luis", "Patricia", "Eva", "Fernando"
        ));

        // 2. Usar Iterator para imprimir (Recorrido simple)
        System.out.println("--- Recorrido con Iterator ---");
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            System.out.println("Nombre: " + it.next());
        }

        // 3. Usar ListIterator (Hacia adelante y hacia atrás)
        System.out.println("\n--- ListIterator: Adelante y Atrás ---");
        ListIterator<String> listIt = nombres.listIterator();

        System.out.print("Hacia adelante: ");
        while (listIt.hasNext()) {
            System.out.print(listIt.next() + " ");
        }

        System.out.print("\nHacia atrás: ");
        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }
        System.out.println();

        // 4. Modificar la lista: Eliminar cortos (<5) y modificar largos
        listIt = nombres.listIterator(); // Reiniciamos el cursor al inicio
        while (listIt.hasNext()) {
            String nombre = listIt.next();
            if (nombre.length() < 5) {
                listIt.remove(); // Elimina Ana, Luis, Eva
            } else {
                listIt.set(nombre + " (modificado)"); // Cambia el valor actual
            }
        }

        // 5. Imprimir lista final
        System.out.println("\n--- Lista Final Modificada ---");
        System.out.println(nombres);
    }
}

