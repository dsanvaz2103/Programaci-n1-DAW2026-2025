package Tema9.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Pedir el nombre completo
        System.out.println("Introduzca su nombre completo:");
        String nombreCompleto = teclado.nextLine();

        // 2. Pedir la edad controlando que sea un número entero
        int edad = 0;
        System.out.println("Introduzca su edad:");

        // Mientras lo que introduzca el usuario NO sea un entero...
        while (!teclado.hasNextInt()) {
            System.out.println("Error: Debe introducir un número entero para la edad. Inténtelo de nuevo:");
            teclado.next(); // Descarta la entrada incorrecta para evitar un bucle infinito
        }

        // Cuando ya estamos seguros de que es un entero, lo leemos
        edad = teclado.nextInt();

        // 3. Mostrar el resultado final ("Hola mundo" personalizado)
        System.out.println("------------------------------------");
        System.out.println("Hola " + nombreCompleto + "!");
        System.out.println("Tienes " + edad + " años.");

        // Cerramos el recurso
        teclado.close();
    }
}