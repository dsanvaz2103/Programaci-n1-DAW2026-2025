package Tema6.Ejercicio1.Animales;

import Tema6.Ejercicio1.Nadador;

// Clase Pez
public class Pez extends Animal implements Nadador {
    @Override
    void hacerSonido() { System.out.println("Glup!"); }

    @Override
    void moverse() { System.out.println("El pez nada en el agua."); }

    @Override
    public void nadar() { System.out.println("Moviendo las aletas."); }
}
