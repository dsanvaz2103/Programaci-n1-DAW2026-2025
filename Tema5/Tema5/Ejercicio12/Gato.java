package Tema5.Ejercicio12;

class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato dice: ¡Miau!");
    }

    @Override
    public String moverse() {
        return "El gato salta de forma ágil.";
    }
}