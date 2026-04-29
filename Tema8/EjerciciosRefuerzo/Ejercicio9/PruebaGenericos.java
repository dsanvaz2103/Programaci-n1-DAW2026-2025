package UD8.EjerciciosRefuerzo.Ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class PruebaGenericos {
    public static void main(String[] args) {

        // 1. ArrayList sin tipo genérico (Raw List)
        // Esto permite mezclar "peras con manzanas"
        List miListaRaw = new ArrayList();
        miListaRaw.add("Hola");    // String
        miListaRaw.add(100);       // Integer
        miListaRaw.add(15.5);      // Double

        // Intento de obtener un String sin casting
        // String texto = miListaRaw.get(0); // ERROR DE COMPILACIÓN: Incompatible types
        String texto = (String) miListaRaw.get(0); // Necesita casting manual
        System.out.println("Texto extraído con casting: " + texto);

        // Riesgo de ClassCastException:
        // String error = (String) miListaRaw.get(1); // ERROR EN EJECUCIÓN: Integer no es String

        // 2. ArrayList con tipo genérico (Seguridad total)
        List<String> miListaGenerica = new ArrayList<>();

        // miListaGenerica.add(100); // ERROR DE COMPILACIÓN inmediato: El IDE te avisa

        miListaGenerica.add("Java");
        miListaGenerica.add("Colecciones");
        miListaGenerica.add("Generics");

        // Obtener elemento sin casting
        String palabra = miListaGenerica.get(0); // Funciona directo
        System.out.println("Extraído de lista genérica: " + palabra);
    }
}
