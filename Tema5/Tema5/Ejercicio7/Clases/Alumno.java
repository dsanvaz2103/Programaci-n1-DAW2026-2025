package Tema5.Ejercicio7.Clases;

public class Alumno extends Persona {
    private String ciclo;

    public Alumno() {
        super();
    }

    public Alumno(String nombre, int edad, String ciclo) {
        super(nombre, edad); // Reutiliza el constructor del padre
        this.ciclo = ciclo;
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando el ciclo de " + ciclo);
    }

    @Override
    public void presentarse() {
        super.presentarse(); // Invoca el método del padre
        System.out.println("Específicamente, soy un alumno del ciclo: " + ciclo);
    }
}