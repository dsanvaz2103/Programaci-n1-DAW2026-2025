package Tema7.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class GestionColecciones {

    static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();

        try {
            System.out.println("Añadiendo números...");
            insertarDato(listaNumeros, 5);
            insertarDato(listaNumeros, 12);
            insertarDato(listaNumeros, 8);

            // Intentamos meter un dato que ya existe
            System.out.println("Intentando añadir el 12 de nuevo...");
            insertarDato(listaNumeros, 12);

        } catch (NumeroRepetido e) {
            // Paso 3: Captura de la excepción específica
            System.out.println("\n--- ALERTA DE SEGURIDAD ---");
            System.out.println("Error detectado: " + e.getMessage());
        } finally {
            System.out.println("\nContenido final de la lista: " + listaNumeros);
        }
    }

    /**
     * Inserta un número si no existe, de lo contrario lanza NumeroRepetido
     */
    public static void insertarDato(List<Integer> lista, int num) {
        if (lista.contains(num)) {
            // Lanzamos nuestra excepción personalizada
            throw new NumeroRepetido("El número " + num + " ya existe en la colección.");
        }
        lista.add(num);
        System.out.println("Número " + num + " insertado.");
    }
}