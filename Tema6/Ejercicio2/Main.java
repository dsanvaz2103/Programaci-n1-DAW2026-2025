package Tema6.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Parte 3: Uso de colecciones y polimorfismo
        List<AnimalBase> listaAnimales = new ArrayList<>();

        listaAnimales.add(new Perro("Bobby"));
        listaAnimales.add(new Gato("Luna"));
        listaAnimales.add(new Vaca("Paca"));
        listaAnimales.add(new Pajaro("Pipo"));

        // Parte 6: Recorrer y ejecutar comportamientos
        for (AnimalBase a : listaAnimales) {
            a.mostrarNombre();
            a.comer();
            a.hacerSonido();

            // Parte 7: Reto (Detección de interfaz Volador)
            if (a instanceof Volador) {
                ((Volador) a).volar();
            }
        }
    }
}
