package UD8.Ejercicio8;

import java.util.Set;
import java.util.TreeSet;

public class ArbolNumerico {
    public static void main(String[] args) {
        // 1. Crear el conjunto (Árbol binario)
        Set<Integer> numeros = new TreeSet<>();

        // 2. Añadir números en orden aleatorio
        numeros.add(50);
        numeros.add(10);
        numeros.add(35);

        // 3. Recorrer e imprimir (Saldrán de menor a mayor)
        System.out.println("Números ordenados en el árbol:");
        for (Integer n : numeros) {
            System.out.println(n);
        }
    }
}