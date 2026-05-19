package Tema9.Ejercicio13;

import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersion = 1L;
    String nombre;
    String apellido;
    Direccion direccion;

    public Persona(String nombre, String apellido,Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
