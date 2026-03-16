package Tema5.Ejercicio12;

class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro dice: ¡Guau guau!");
    }

    @Override
    public String moverse() {
        return "El perro corre por el suelo.";
    }
}