package UD8.Ejercicio7;

import java.util.Set;
import java.util.LinkedHashSet;

public class GestionAlumnos {
    public static void main(String[] args) {
        // 1. Crea un conjunto vacío de cadenas (Interfaz = Implementación)
        Set<String> alumnos = new LinkedHashSet<>();

        // 2. Agrega nombres de varios alumnos
        alumnos.add("Ana");
        alumnos.add("Berto");
        alumnos.add("Carla");

        // 3. Imprime el conjunto
        // ¿Imprime referencia o valor? Imprime el VALOR. 
        // Los Sets en Java tienen el metodo toString() sobrescrito para mostrar el contenido.
        System.out.println("Contenido inicial: " + alumnos);

        // 4. Añade un nombre repetido
        // ¿Permite duplicados? NO. El metodo .add() devolverá 'false' y no lo incluirá.
        alumnos.add("Ana");
        System.out.println("Tras intentar repetir 'Ana': " + alumnos);

        // 5. Añade un null
        // ¿Permite nulos? SÍ (en HashSet y LinkedHashSet). 
        // Nota: TreeSet NO permite nulos porque necesita comparar elementos para ordenar.
        alumnos.add(null);
        System.out.println("Tras añadir un null: " + alumnos);

        // 6. Recorre con orden de inserción y prefijo "D."
        System.out.println("\nRecorrido con prefijo:");
        for (String alumno : alumnos) {
            // Manejamos el null para evitar errores al concatenar
            String nombreMostrado = (alumno == null) ? "Nulo" : alumno;
            System.out.println("D. " + nombreMostrado);
        }
    }
}