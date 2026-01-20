package Tema4.ejercicio1;
import  Tema4.ejercicio1.Mes;
import Tema4.ejercicio2.DiaDeLaSemana;

public class Persona {
    // Atributos
    String nombre;
    String apellido;
    int edad;
    float estatura;
    DiaDeLaSemana dia;
    Sexo sexo;

    // Constructores
    Persona(String nombre, String apellido, int edad, float estatura, Sexo sexo) {
        this(nombre, apellido, edad, estatura);
        this.sexo = sexo;
    }

    Persona(String nombre, String apellido, int edad, float estatura) {
        this(nombre + " " + apellido, edad, estatura);
        this.apellido = apellido;
    }

    Persona(String nombre, int edad, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    Persona(String nombre) {
        this.nombre = nombre;
    }

    Persona(int edad) {
        this.edad = edad;
    }

    Persona() {
        this.nombre ="anónino";
    }

    // Métodos
    void saludar() {
        System.out.println("Hola!");
    }

    void cumplirAnios() {
        edad++;
    }

    void crecer(int incremento) {
        estatura += incremento;
    }

    public enum Sexo {
        MASCULINO, FEMENINO, NO_BINARIO
    }
}
