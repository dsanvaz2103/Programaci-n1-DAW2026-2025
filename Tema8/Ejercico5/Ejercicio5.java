package Tema8.Ejercico5;

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        // 1. Crea un conjunto vacío de números enteros
        Set<Integer> miSet = new HashSet<>();

        // 2. Agrega los primeros 5 números naturales (1, 2, 3, 4, 5)
        miSet.add(1);
        miSet.add(2);
        miSet.add(3);
        miSet.add(4);
        miSet.add(5);

        // 3. Imprime el conjunto
        System.out.println("Contenido del conjunto: " + miSet);
        // Imprime el VALOR. La clase HashSet hereda de AbstractCollection,
        // que redefine el metodo toString() para mostrar los elementos.

        // 4. Añade un número repetido
        boolean seAgregoRepetido = miSet.add(3);
        System.out.println("¿Se añadió el 3 repetido?: " + seAgregoRepetido);
        // ¿Permite duplicados? NO. Los Set por definición no admiten elementos duplicados.

        // 5. Añade un null
        miSet.add(null);
        System.out.println("Conjunto tras añadir null: " + miSet);
        // ¿Permite nulos? SÍ (en el caso de HashSet). Algunas implementaciones como TreeSet no lo permiten.

        // 6. Nuevo conjunto de primos y comprobar si es subconjunto
        Set<Integer> primos = new HashSet<>();
        primos.add(2);
        primos.add(3);

        boolean esSubconjunto = miSet.containsAll(primos);
        System.out.println("¿El conjunto de primos es subconjunto del primero?: " + esSubconjunto);

        // 7. Declarar una lista final con los valores del conjunto
        final List<Integer> miLista = new ArrayList<>(miSet);
        System.out.println("Lista final inicializada: " + miLista);

        // --- Respuestas a las preguntas sobre la lista final ---
        /*
         * ¿Será la lista inmutable?
         * NO. El modificador 'final' en un objeto significa que la REFERENCIA no puede cambiar
         * (no puedes hacer miLista = new ArrayList<>()), pero el contenido del objeto sí es mutable.
         *
         * ¿Podemos añadir, eliminar o modificar elementos?
         * SÍ. Podemos usar miLista.add(), miLista.remove() o miLista.set() sin problemas.
         */
    }
}