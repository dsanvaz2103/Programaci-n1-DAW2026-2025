package UD8.EjerciciosRefuerzo.Ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparativaListasCompleta {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        final int TOTAL = 100000;

        // 1. AÑADIR AL FINAL
        System.out.println("--- 1. Añadiendo " + TOTAL + " elementos al final ---");
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < TOTAL; i++) arrayList.add(i);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - inicio) + " ms");

        inicio = System.currentTimeMillis();
        for (int i = 0; i < TOTAL; i++) linkedList.add(i);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - inicio) + " ms");

        // 2. AÑADIR AL PRINCIPIO (1.000 elementos)
        System.out.println("\n--- 2. Añadiendo 1.000 elementos al principio ---");
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) arrayList.add(0, i);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - inicio) + " ms");

        inicio = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) linkedList.add(0, i);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - inicio) + " ms");

        // 3. ACCESO POR ÍNDICE (Recorrer los primeros 10.000 para no tardar una eternidad)
        System.out.println("\n--- 3. Acceso por índice (get) - Primeros 10.000 ---");
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) arrayList.get(i);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - inicio) + " ms");

        inicio = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) linkedList.get(i);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - inicio) + " ms");
    }
}