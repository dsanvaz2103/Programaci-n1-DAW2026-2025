package Tema5.Ejercicio11;

public class Main {
    public static void main(String[] args) {
        // Crear instancias
        Libro libro1 = new Libro("Cien años de soledad", "García Márquez", "123-ABC", 1967);
        Libro libro2 = new Libro("El amor en tiempos del cólera", "García Márquez", "123-ABC", 1985);
        Libro libro3 = new Libro("1984", "George Orwell", "999-XYZ", 1949);

        // A. Imprimir usando toString()
        System.out.println("Libro 1: " + libro1);
        System.out.println("Libro 3: " + libro3);

        System.out.println("\n--- Pruebas de Comparación ---");

        // B. Comparar libros con mismo ISBN (debería ser true)
        System.out.println("¿Libro 1 es igual a Libro 2? (Mismo ISBN): " + libro1.equals(libro2));

        // C. Comparar libros con ISBN diferente (debería ser false)
        System.out.println("¿Libro 1 es igual a Libro 3? (Distinto ISBN): " + libro1.equals(libro3));
    }
}
