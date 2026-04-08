package Tema6.Ejercicio2;

class Vaca extends AnimalBase {
    public Vaca(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() { System.out.println("Muuuu"); }

    @Override
    public void comer() { System.out.println("Pastando hierba..."); }
}