package UD8.Ejercicio11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ClubLectura {

    public static void main(String[] args) {
        // 1. Almacenar los nombres de los libros en un HashSet
        HashSet<String> libros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        System.out.println("--- Gestión del Club de Lectura ---");

        // 2. Permitir al usuario agregar libros
        do {
            System.out.print("Introduce el título del libro (o 'salir' para finalizar): ");
            opcion = scanner.nextLine();

            if (!opcion.equalsIgnoreCase("salir")) {
                boolean agregado = libros.add(opcion);
                if (agregado) {
                    System.out.println("Libro añadido con éxito.");
                } else {
                    System.out.println("El libro ya existe en el club (no se permiten duplicados).");
                }
            }
        } while (!opcion.equalsIgnoreCase("salir"));

        // 3. Mostrar los libros recorriendo el conjunto
        System.out.println("\n--- Lista de Libros (Usando Iterator) ---");
        Iterator<String> it = libros.iterator();
        while (it.hasNext()) {
            System.out.println("- " + it.next());
        }

        System.out.println("\n--- Lista de Libros (Usando For-Each) ---");
        for (String libro : libros) {
            System.out.println("- " + libro);
        }

        scanner.close();
    }
}

/* --- REFLEXIÓN ---

1. ¿Por qué HashSet no garantiza un orden específico?
   HashSet utiliza una tabla hash internamente. Los elementos se almacenan basándose en su 'hash code',
   lo cual está diseñado para que el acceso sea extremadamente rápido (O(1)), pero no para
   preservar el orden de inserción ni el orden alfabético. Si necesitas orden, tendrías que
   usar LinkedHashSet (orden de inserción) o TreeSet (orden natural).

2. ¿Cuándo sería preferible usar un Iterator en lugar de un for-each?
   El Iterator es preferible cuando necesitas eliminar elementos de la colección mientras la
   estás recorriendo. El metodo it.remove() es la única forma segura de modificar una colección
   durante la iteración sin causar errores. El for-each es simplemente "azúcar sintáctico"
   para lectura y es más limpio si solo vas a mostrar los datos.

3. ¿Qué pasaría si intentamos modificar el Set mientras iteramos con for-each?
   Se lanzaría una excepción de tipo 'ConcurrentModificationException'. Esto ocurre porque el
   bucle for-each utiliza un Iterator por debajo, y si la estructura de la colección cambia
   (añadir o borrar elementos) de forma externa al Iterator, este detecta que la colección
   ya no es consistente y detiene la ejecución por seguridad.
*/