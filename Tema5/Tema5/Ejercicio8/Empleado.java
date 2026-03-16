package Tema5.Ejercicio8;

public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método que será sobrescrito
    public double calcularSalario() {
        return 0;
    }
}
