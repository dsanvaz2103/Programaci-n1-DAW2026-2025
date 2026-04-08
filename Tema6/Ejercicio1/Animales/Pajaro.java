package Tema6.Ejercicio1.Animales;

import Tema6.Ejercicio1.Volador;

// Clase Pájaro
public class Pajaro extends Animal implements Volador {
    @Override
    void hacerSonido() { System.out.println("Pío!"); }

    @Override
    void moverse() { System.out.println("El pájaro vuela por el cielo."); }

    @Override
    public void volar() { System.out.println("Batiendo las alas."); }
}