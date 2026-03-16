package Tema5.Ejercicio12;

class Pajaro extends Animal {
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro dice: ¡Pío pío!");
    }

    @Override
    public String moverse() {
        return "El pájaro vuela por el cielo.";
    }
}