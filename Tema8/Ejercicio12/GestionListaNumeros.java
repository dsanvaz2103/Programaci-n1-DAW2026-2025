package UD8.Ejercicio12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class GestionListaNumeros {

    public static void main(String[] args) {
        // 1. Inicialización de la lista con al menos 10 números
        List<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

        System.out.println("Lista inicial: " + numeros);

        // Creamos el ListIterator
        ListIterator<Integer> it = numeros.listIterator();

        // 2. Recorrido hacia adelante: Multiplicar por 2 si > 50 y mostrar índices
        System.out.println("\n--- Recorrido hacia adelante (Modificando > 50) ---");
        while (it.hasNext()) {
            int indiceActual = it.nextIndex(); // Obtener índice actual
            int valor = it.next();

            System.out.println("Índice: " + indiceActual + " | Valor: " + valor);

            if (valor > 50) {
                it.set(valor * 2); // Multiplicamos por 2 y actualizamos
            }
        }

        System.out.println("Lista tras modificaciones: " + numeros);

        // 3. Recorrido hacia atrás: Añadir 25 si el número es < 30
        // En este punto, el iterador ya está al final de la lista.
        System.out.println("\n--- Recorrido hacia atrás (Insertando 25 si < 30) ---");
        while (it.hasPrevious()) {
            int indiceAnterior = it.previousIndex(); // Obtener índice previo
            int valor = it.previous();

            System.out.println("Índice: " + indiceAnterior + " | Valor: " + valor);

            if (valor < 30) {
                // El metodo add inserta el elemento ANTES de lo que devolvería next()
                // y DESPUÉS de lo que devolvería previous()
                it.add(25);
                // Tras el add, el iterador se posiciona después del elemento insertado.
                // Llamamos a previous() si queremos volver a saltar el elemento insertado
                // para no entrar en un bucle infinito en ciertos escenarios,
                // aunque aquí no es estrictamente necesario por la condición < 30.
                it.previous();
            }
        }

        System.out.println("Lista final tras inserciones: " + numeros);
    }
}