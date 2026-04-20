package Tema8.Ejercicio9;

import Tema8.Persona;

import java.util.*;

public class InsercionPersonas {
    static void main() {
        Set<Persona> persona = new TreeSet<>();

        persona.add(new Persona("David", "Sanchez",21));
        persona.add(new Persona("Pablo", "Jimenez",26));
        persona.add(new Persona("Juan", "Vazquez",25));
        persona.add(new Persona("Luis", "Rosado",31));
        persona.add(new Persona("Isabel", "Martinez",27));
        persona.add(new Persona("Fran", "Gomez",40));
        persona.add(new Persona("Yael", "Garcia",12));
        persona.add(new Persona("Alvaro", "Perez",20));
        persona.add(new Persona("Alejandro", "Gonzalez",29));

        System.out.println(persona);


    }
}
