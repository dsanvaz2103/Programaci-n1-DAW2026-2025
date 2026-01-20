package EjerciciosEclipse;

import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;
        int edadMinima = Integer.MAX_VALUE; // Inicializamos con el valor máximo posible
        int edadMaxima = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible

        System.out.println("Introduce las edades de los alumnos (termina con -1):");

        while (true) {
            System.out.print("Edad: ");
            edad = scanner.nextInt();

            if (edad == -1) {
                break; // salir del bucle
            }

            // Actualizar edad mínima y máxima
            if (edad < edadMinima) {
                edadMinima = edad;
            }
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
        }

        // Comprobar si se introdujeron edades
        if (edadMinima == Integer.MAX_VALUE || edadMaxima == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron edades.");
        } else {
            System.out.println("Edad mínima: " + edadMinima);
            System.out.println("Edad máxima: " + edadMaxima);
        }
    }
}
