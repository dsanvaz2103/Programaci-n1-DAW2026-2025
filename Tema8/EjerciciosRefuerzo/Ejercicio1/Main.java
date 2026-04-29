package UD8.EjerciciosRefuerzo.Ejercicio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creamos 6 libros (nótese que L5 y L6 tienen ISBNs duplicados de L1 y L2)
        Libro l1 = new Libro("111", "Don Quijote", "Cervantes");
        Libro l2 = new Libro("222", "1984", "George Orwell");
        Libro l3 = new Libro("333", "Rayuela", "Julio Cortázar");
        Libro l4 = new Libro("444", "Metamorfosis", "Kafka");
        Libro l5 = new Libro("111", "Don Quijote (Duplicado)", "Cervantes"); // Duplicado de l1
        Libro l6 = new Libro("222", "1984 (Copia)", "George Orwell");       // Duplicado de l2
        Set<Libro> libroOrdenAleatorio = new HashSet<>();
        libroOrdenAleatorio.add(l1);
        libroOrdenAleatorio.add(l2);
        libroOrdenAleatorio.add(l3);
        libroOrdenAleatorio.add(l4);
        libroOrdenAleatorio.add(l5);
        libroOrdenAleatorio.add(l6);
        Set<Libro> librosOrdenInserccion = new LinkedHashSet<>();
        librosOrdenInserccion.addAll(libroOrdenAleatorio);
        Set<Libro> librosOrdenNatural = new TreeSet<>();
        librosOrdenNatural.addAll(libroOrdenAleatorio);

        System.out.println("Recorrido con For-Each");
        for (Libro libro : libroOrdenAleatorio) {
            System.out.println(libro.getTitulo());
        }
        System.out.println("Tamaño: "+libroOrdenAleatorio.size());

        System.out.println("Recorrido con For-Each");
        for (Libro libro : librosOrdenInserccion) {
            System.out.println(libro.getTitulo());
        }
        System.out.println("Tamaño: "+ librosOrdenInserccion.size());

        System.out.println("Recorrido con Iterator");
        Iterator<Libro> it = librosOrdenNatural.iterator();
        while (it.hasNext()) {
            Libro libro = it.next();
            System.out.println("ISBN: " + libro.isbn + " Titulo: " + libro.titulo + " Autor: " + libro.autor);
        }
        System.out.println("Tamaño: " + librosOrdenNatural.size());




    }
}
