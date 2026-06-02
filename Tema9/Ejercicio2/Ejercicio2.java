package Tema9.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Usamos System.in para leer del teclado
        Scanner teclado = new Scanner(System.in);

        // PASO 1: Imprimir las instrucciones iniciales
        System.out.println("Introduzca varios caracteres");

        // PASO 2: Añadir la condición de finalización
        System.out.println("Introduzca varios caracteres y después pulse intro para finalizar");

        // El programa lee los caracteres hasta que se pulsa la tecla Intro
        String caracteres = teclado.nextLine();

        // PASO 3: El "hola mundo" pidiendo el nombre utilizando el código anterior
        System.out.println("Introduzca su nombre");

        // Reutilizamos el método nextLine() para capturar el nombre
        String nombre = teclado.nextLine();

        // Salida final con el formato del ejemplo
        System.out.println("Hola " + nombre + "!");

        // Cerramos el scanner al terminar
        teclado.close();
    }
}
