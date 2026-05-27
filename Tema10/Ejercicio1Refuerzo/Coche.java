package Tema10.Ejercicio1Refuerzo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

public class Coche implements Serializable {
    private String nombre;
    private String color;

    public Coche() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
