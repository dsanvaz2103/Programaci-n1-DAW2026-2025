package UD8.Ejercicio8;

import java.util.Set;
import java.util.TreeSet;

public class ArbolAlumnos {
    public static void main(String[] args) {
        // 1. Crear el conjunto
        Set<String> alumnos = new TreeSet<>();

        // 2. Añadir nombres en orden aleatorio
        alumnos.add("Zaira");
        alumnos.add("Alberto");
        alumnos.add("Mario");

        // 3. Recorrer e imprimir (Saldrán por orden alfabético)
        System.out.println("Alumnos ordenados alfabéticamente:");
        for (String nombre : alumnos) {
            System.out.println(nombre);
        }
    }
}