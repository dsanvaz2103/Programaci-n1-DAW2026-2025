package UD8.EjerciciosRefuerzo.Ejercicio5;

import java.util.Comparator;

public class Producto implements Comparator<Producto> {
    String id;
    String nombre;
    double precio;

    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compare(Producto producto1, Producto producto2) {
        if (producto1.precio < producto2.precio) {
            return -1;
        }else if (producto1.precio > producto2.precio) {
            return 1;
        }else  {
            if (producto1.id.compareTo(producto2.id) == 0) {
                return 0;
            }else if (producto1.id.compareTo(producto2.id) > 0) {
                return -1;
            }else  {
                return 1;
            }
        }
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Producto{" + "id='" + id + '\'' + ", nombre='" + nombre + '\'' + ", precio=" + precio + '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
