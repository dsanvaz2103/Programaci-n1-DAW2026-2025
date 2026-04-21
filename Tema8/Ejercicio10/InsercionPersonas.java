package Tema8.Ejercicio10;

import Tema8.Persona;
import java.util.*;

public class InsercionPersonas {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("David", "Sanchez", 21));
        lista.add(new Persona("Yael", "Garcia", 12));
        lista.add(new Persona("Alvaro", "Perez", 20));
        lista.add(new Persona("SinApellido", null, 30)); // Para probar la ampliación

        // 1. Ordenar por Edad
        System.out.println("\n--- Ordenado por Edad ---");
        lista.sort(new ComparadoresPersona.CompararEdad());
        System.out.println(lista);

        // 2. Ordenar por Apellidos
        System.out.println("\n--- Ordenado por Apellidos ---");
        // Usamos una lambda para variar (opcional)
        lista.sort(Comparator.comparing(Persona::getApellidos, Comparator.nullsFirst(String::compareTo)));
        System.out.println(lista);

        // 3. Ordenar por Apellido, Nombre y Edad (Ampliación incluida)
        System.out.println("\n--- Ordenado por Apellido > Nombre > Edad (Nulls first) ---");
        lista.sort(new ComparadoresPersona.CompararTodo());
        System.out.println(lista);
    }


}