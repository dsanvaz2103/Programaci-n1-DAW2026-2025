package UD8.EjerciciosRefuerzo.Ejercicio4;

public class Producto implements Comparable<Producto>{
    String id;
    String nombre;
    double precio;

    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto producto) {
        return this.nombre.compareTo(producto.nombre);
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
