package Tema9.Ejercicio14;

import java.io.Serializable;

public class Item implements Serializable {
    private static final long serialVersion = 1L;

    String nombre;
    double peso;
    int valor;

    public Item(String nombre, double peso, int valor) {
        this.nombre = nombre;
        this.peso = peso;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


}
