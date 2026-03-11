package Tema5.Ejercicio7.Clases;

public class Main {
    static void main() {
        Persona p1 = new Persona("David", 21);
        Persona p2 = new Persona("David", 23);
        System.out.println(p1.equals(p2));

        //Apartado Clase libros

        Libro l1 = new Libro("Sancho Panza","Juan Ramon","4324423N", 2033);
        Libro l2 = new Libro("El Rio Pan","Pablos Jose","4325523N", 2005);
        Libro l3 = new Libro("Jose Maria El Pecador","Juan Ramon","432444N", 2004);
    }
}
