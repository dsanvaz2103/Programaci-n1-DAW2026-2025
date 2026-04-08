package Tema7.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class GestionListas {

    static void main(String[] args) {
        List<Integer> miLista = new ArrayList<>();

        // Intentamos añadir números a la lista
        try {
            agregarNumero(miLista, 10);
            agregarNumero(miLista, 20);
            agregarNumero(miLista, 30);

            System.out.println("Intentando añadir un número duplicado (20)...");
            agregarNumero(miLista, 20); // Esto lanzará la excepción

        } catch (NumeroDuplicadoException e) {
            // Finalmente, capturamos e imprimimos traza y mensaje
            System.out.println("\n--- EXCEPCIÓN CAPTURADA EN EL MAIN ---");
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("Traza del error:");
            e.printStackTrace();
        }

        System.out.println("\nEstado final de la lista: " + miLista);
    }

    /**
     * Añade un número a la lista o propaga una excepción si ya existe.
     * @throws NumeroDuplicadoException cuando el número ya está en la lista.
     */
    public static void agregarNumero(List<Integer> lista, int numero) throws NumeroDuplicadoException {
        if (lista.contains(numero)) {
            // Lanzamos la excepción manualmente con un mensaje descriptivo
            throw new NumeroDuplicadoException("Error: El número " + numero + " ya se encuentra en la lista.");
        }
        lista.add(numero);
        System.out.println("Número " + numero + " añadido correctamente.");
    }
}
