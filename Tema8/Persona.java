package Tema8;

import java.util.Objects;

/**
 * Implementamos Comparable<Persona> con genéricos para evitar casts manuales.
 */
public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.apellidos = ""; // Evitamos nulos por defecto si prefieres
    }

    // --- GETTERS Y SETTERS ---
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    // --- MÉTODOS DE ORDEN E IGUALDAD ---

    /**
     * Orden Natural: Alfabético por nombre.
     * IMPORTANTE: Si el nombre coincide, desempatamos por apellido para que
     * el TreeSet no borre a personas con mismo nombre.
     */
    @Override
    public int compareTo(Persona otra) {
        int res = this.nombre.compareTo(otra.nombre);
        if (res == 0 && this.apellidos != null && otra.apellidos != null) {
            res = this.apellidos.compareTo(otra.apellidos);
        }
        return res;
    }

    /**
     * Dos personas son iguales si nombre y apellidos coinciden.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) &&
                Objects.equals(apellidos, persona.apellidos);
    }

    /**
     * El hash debe ser consistente con equals.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }

    @Override
    public String toString() {
        return String.format("Persona{nombre='%s', apellidos='%s', edad=%d}",
                nombre, apellidos, edad);
    }
}