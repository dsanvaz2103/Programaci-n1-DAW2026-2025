package Tema6.Ejercicio2;

class Pajaro extends AnimalBase implements Volador {
    public Pajaro(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() { System.out.println("Pío Pío"); }

    @Override
    public void comer() { System.out.println("Comiendo alpiste..."); }

    @Override
    public void volar() { System.out.println("¡Estoy volando por el cielo!"); }
}
