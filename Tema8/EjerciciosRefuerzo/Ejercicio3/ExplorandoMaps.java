package UD8.EjerciciosRefuerzo.Ejercicio3;

import java.util.*;

public class ExplorandoMaps {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        Map<Integer, String> mapa2 = new LinkedHashMap<>();
        Map<Integer, String> mapa3 = new TreeMap<>();

        int[] ids = {50, 10, 40, 20, 30};
        String[] nombres = {"David", "Pablo", "Juanito", "Fran", "Pedro"};

        for (int i = 0; i < ids.length; i++) {
            mapa.put(ids[i], nombres[i]);
            mapa2.put(ids[i], nombres[i]);
            mapa3.put(ids[i], nombres[i]);
        }


        imprimirMapa("HashMap (Orden impredecible)", mapa);
        imprimirMapa("LinkedHashMap (Orden de inserción)", mapa2);
        imprimirMapa("TreeMap (Ordenado por Clave/ID)", mapa3);
    }

    public static void imprimirMapa(String titulo, Map<Integer, String> mapa) {
        System.out.println("Mapa: " + titulo);
        Iterator it = mapa.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
