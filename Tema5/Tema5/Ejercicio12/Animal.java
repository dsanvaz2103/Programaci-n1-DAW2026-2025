package Tema5.Ejercicio12;

abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " años.");
    }

    // Métodos abstractos: no tienen cuerpo, las hijas deben definirlos
    public abstract void hacerSonido();
    public abstract String moverse();
}
