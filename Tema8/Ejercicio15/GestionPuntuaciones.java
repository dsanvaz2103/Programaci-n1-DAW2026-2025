package UD8.Ejercicio15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionPuntuaciones {
    public static void main(String[] args) {
        // 1. Crear la lista con 6 puntuaciones desordenadas
        List<Integer> puntuaciones = new ArrayList<>();
        puntuaciones.add(450);
        puntuaciones.add(1200);
        puntuaciones.add(300);
        puntuaciones.add(800);
        puntuaciones.add(1500);
        puntuaciones.add(100);

        System.out.println("1. Lista inicial: " + puntuaciones);

        // 2. Ordenar de menor a mayor
        Collections.sort(puntuaciones);
        System.out.println("2. Lista ordenada (menor a mayor): " + puntuaciones);

        // 3. Buscar puntuación más alta y más baja
        int max = Collections.max(puntuaciones);
        int min = Collections.min(puntuaciones);
        System.out.println("3. Puntuación más baja: " + min);
        System.out.println("   Puntuación más alta: " + max);

        // 4. Desordenar (Sorteo)
        Collections.shuffle(puntuaciones);
        System.out.println("4. Lista desordenada (shuffle): " + puntuaciones);
    }
}