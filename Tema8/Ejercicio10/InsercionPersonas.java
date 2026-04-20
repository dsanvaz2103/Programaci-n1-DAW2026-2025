package Tema8.Ejercicio10;

import Tema8.Persona;
import java.util.*;

public class InsercionPersonas {
    public static void main(String[] args) {
        // TreeSet usa el compareTo de Persona para ordenar y evitar duplicados
        Set<Persona> personas = new TreeSet<>();

        personas.add(new Persona("David", "Sanchez", 21));
        personas.add(new Persona("Pablo", "Jimenez", 26));
        personas.add(new Persona("Juan", "Vazquez", 25));
        personas.add(new Persona("Luis", "Rosado", 31));
        personas.add(new Persona("Isabel", "Martinez", 27));
        personas.add(new Persona("Fran", "Gomez", 40));
        personas.add(new Persona("Yael", "Garcia", 12));
        personas.add(new Persona("Alvaro", "Perez", 20));
        personas.add(new Persona("Alejandro", "Gonzalez", 29));

        // Intento de añadir duplicado (no se añadirá porque compareTo devolverá 0 por el nombre)
        personas.add(new Persona("David", "Otro Apellido", 50));

        System.out.println("Contenido del TreeSet (Orden Natural por Nombre):");
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}