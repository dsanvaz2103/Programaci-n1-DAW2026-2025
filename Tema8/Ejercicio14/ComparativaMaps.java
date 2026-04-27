package UD8.Ejercicio14;

import java.util.*;

public class ComparativaMaps {

    public static void main(String[] args) {
        // Creación de las estructuras
        Map<String, Integer> aleatorio = new HashMap<>();
        Map<String, Integer> insercion = new LinkedHashMap<>();
        Map<String, Integer> alfabetico = new TreeMap<>();

        // Datos a insertar (Exactamente el mismo orden)
        String[] nombres = {"Zoe", "Bernat", "Ana", "Mario"};
        int[] puntos = {85, 92, 78, 88};

        for (int i = 0; i < nombres.length; i++) {
            aleatorio.put(nombres[i], puntos[i]);
            insercion.put(nombres[i], puntos[i]);
            alfabetico.put(nombres[i], puntos[i]);
        }

        // Ejecución y muestra
        mostrarMapa(aleatorio, "HashMap (Orden impredecible)");
        mostrarMapa(insercion, "LinkedHashMap (Orden de inserción)");
        mostrarMapa(alfabetico, "TreeMap (Orden natural/alfabético)");
    }

    public static void mostrarMapa(Map<String, Integer> mapa, String tipo) {
        System.out.println("--- " + tipo + " ---");

        // Obtención del Iterator del entrySet
        Iterator<Map.Entry<String, Integer>> it = mapa.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entrada = it.next();
            System.out.println("Participante: " + entrada.getKey() + " | Puntos: " + entrada.getValue());
        }
        System.out.println();
    }

    /*
    ¿Qué ha pasado en el HashMap?
Los nombres no aparecen en el orden en que los escribiste. HashMap utiliza una función hash para decidir en qué "cubeta" guarda la información. Esto hace que sea el más rápido para buscar datos, pero el orden resultante parece caótico o aleatorio para el usuario.

¿Qué ha pasado en el LinkedHashMap?
En este caso, sí se ha respetado el orden de llegada. LinkedHashMap funciona como un HashMap pero mantiene internamente una lista doblemente enlazada que une todos los elementos en el orden en que fueron insertados. Es ideal si el orden cronológico es importante para ti.

¿Qué ha pasado en el TreeMap?
Los nombres aparecen ordenados alfabéticamente (Ana, Bernat, Mario, Zoe). TreeMap no guarda los datos según cuándo llegaron, sino que los organiza automáticamente usando una estructura de árbol (Red-Black Tree), asegurando que las llaves siempre sigan su "orden natural".
     */
}