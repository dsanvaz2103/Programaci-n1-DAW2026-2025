package Tema6.Ejercicio2;

class Perro extends AnimalBase {
    public Perro(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() { System.out.println("Guau Guau"); }

    @Override
    public void comer() { System.out.println("Comiendo croquetas..."); }
}