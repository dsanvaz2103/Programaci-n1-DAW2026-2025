package Tema6.Ejercicio1.Animales;

// Clase Abstracta
public abstract class Animal {
    abstract void hacerSonido();
    abstract void moverse();

    public void mostrarInfo() {
        System.out.println("Soy un " + this.getClass().getSimpleName());
    }
}
