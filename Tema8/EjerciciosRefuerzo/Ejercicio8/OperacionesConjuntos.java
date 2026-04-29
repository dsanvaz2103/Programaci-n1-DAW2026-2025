package UD8.EjerciciosRefuerzo.Ejercicio8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperacionesConjuntos {
    public static void main(String[] args) {
        // 1. Crear los conjuntos originales
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        // 2. UNIÓN (A + B)
        // Usamos copias para no destruir los sets originales
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("\nUnión (addAll): " + union);

        // 3. INTERSECCIÓN (Comunes)
        Set<Integer> interseccion = new HashSet<>(setA);
        interseccion.retainAll(setB);
        System.out.println("Intersección (retainAll): " + interseccion);

        // 4. DIFERENCIA (A - B)
        Set<Integer> diferencia = new HashSet<>(setA);
        diferencia.removeAll(setB);
        System.out.println("Diferencia A - B (removeAll): " + diferencia);
    }
}
