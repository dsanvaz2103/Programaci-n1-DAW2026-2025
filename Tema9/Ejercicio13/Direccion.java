package Tema9.Ejercicio13;

import java.io.Serializable;

public class Direccion implements Serializable {
    String nombre;
    String lugar;

    public Direccion(String nombre, String lugar) {
        this.nombre = nombre;
        this.lugar = lugar;
    }
}
