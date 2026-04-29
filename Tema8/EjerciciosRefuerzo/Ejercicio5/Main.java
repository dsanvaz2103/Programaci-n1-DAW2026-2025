package UD8.EjerciciosRefuerzo.Ejercicio5;

import UD8.EjerciciosRefuerzo.Ejercicio5.Producto;

import java.util.*;

public class Main {
    public static void main(String[] args) {
            List<Producto> lista = new ArrayList<>();
            lista.add(new Producto("10", "Monitor", 250.0));
            lista.add(new Producto("05", "Raton", 20.0));
            lista.add(new Producto("08", "Teclado", 45.0));
            lista.add(new Producto("02", "Cascos", 45.0)); // Mismo precio que teclado
            lista.add(new Producto("12", "Alfombrilla", 15.0));

            // A. Comparator 1: Precio menor a mayor (si igual, por ID)
            Comparator<Producto> ascPrecioId = new Comparator<Producto>() {
                @Override
                public int compare(Producto p1, Producto p2) {
                    if (p1.getPrecio() != p2.getPrecio()) {
                        return Double.compare(p1.getPrecio(), p2.getPrecio());
                    }
                    return p1.getId().compareTo(p2.getId());
                }
            };

            // B. Comparator 2: Precio mayor a menor (Lambda)
            Comparator<Producto> descPrecio = (p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio());

            // --- EJECUCIÓN ---

            System.out.println("--- Orden Ascendente (Precio + ID) ---");
            Collections.sort(lista, ascPrecioId);
            lista.forEach(System.out::println);

            System.out.println("\n--- Orden Descendente (Precio) ---");
            Collections.sort(lista, descPrecio);
            lista.forEach(System.out::println);

            // C. TreeSet con Comparator en el constructor
            System.out.println("\n--- TreeSet (Siempre ordenado por Precio/ID) ---");
            TreeSet<Producto> setOrdenado = new TreeSet<>(ascPrecioId);
            setOrdenado.addAll(lista);
            setOrdenado.forEach(System.out::println);
        }
}

