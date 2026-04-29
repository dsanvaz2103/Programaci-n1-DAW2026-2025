package UD8.EjerciciosRefuerzo.Ejercicio4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Crear ArrayList y añadir productos desordenados
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("2344", "Monitor", 234.43));
        productos.add(new Producto("2345", "AMD", 245.42));
        productos.add(new Producto("2346", "Ryzen4", 333.42));
        productos.add(new Producto("2347", "Raton", 19.42));

        System.out.println("--- Lista desordenada (ArrayList) ---");
        for (Producto p : productos) {
            System.out.println(p);
        }

        // 2. Ordenar usando Collections.sort()
        Collections.sort(productos);

        System.out.println("\n--- Lista ordenada con Collections.sort() (por nombre) ---");
        for (Producto p : productos) {
            System.out.println(p);
        }

        // 3. Crear TreeSet y añadir los mismos productos
        // El TreeSet ordena automáticamente al insertar usando el compareTo de la clase Producto
        Set<Producto> productosTreeSet = new TreeSet<>();
        productosTreeSet.addAll(productos);

        System.out.println("\n--- Elementos del TreeSet (Orden natural automático) ---");
        for (Producto p : productosTreeSet) {
            System.out.println(p);
        }
    }
}
