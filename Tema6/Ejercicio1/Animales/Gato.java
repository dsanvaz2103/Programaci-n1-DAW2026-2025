package Tema6.Ejercicio1.Animales;

import Tema6.Ejercicio1.Corredor;

// Clase Gato
public class Gato extends Animal implements Corredor {
    @Override
    void hacerSonido() { System.out.println("Miau!"); }

    @Override
    void moverse() { System.out.println("El gato salta sigilosamente."); }

    @Override
    public void correr() { System.out.println("Corriendo velozmente."); }
}
