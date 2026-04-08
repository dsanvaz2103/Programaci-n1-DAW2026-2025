package Tema6.Ejercicio2;

class Gato extends AnimalBase {
    public Gato(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() { System.out.println("Miau"); }

    @Override
    public void comer() { System.out.println("Comiendo pescado..."); }
}