package Tema6.Ejercicio1.Animales;

import Tema6.Ejercicio1.Corredor;

// Clase Perro
public class Perro extends Animal implements Corredor {
    @Override
    public void hacerSonido() { System.out.println("Guau!"); }

    @Override
    void moverse() { System.out.println("El perro corre alegremente."); }

    @Override
    public void correr() { System.out.println("Corriendo a 4 patas."); }
}
