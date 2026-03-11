package Tema5.Ejercicio7.Clases;

public class Persona {
    public String nombre;
    public int edad;

    public Persona() {} // Constructor por defecto

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, soy una persona llamada " + nombre);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }

    @Override
    public boolean equals(Object obj){
        return this.nombre == ((Persona) obj).nombre && this.edad == ((Persona) obj).edad;
    }
}
