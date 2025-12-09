package EjerciciosEclipse;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numero1, numero2, respuesta, contador = 0;

        System.out.println("¡Bienvenido al juego de sumas!");
        System.out.println("Resuelve la suma de dos números entre 1 y 100.");
        System.out.println("El juego terminará cuando te equivoques.\n");

        while (true) {
            // Generar dos números aleatorios entre 1 y 100
            numero1 = random.nextInt(100) + 1;
            numero2 = random.nextInt(100) + 1;

            // Mostrar la suma y pedir respuesta al usuario
            System.out.print("¿Cuánto es " + numero1 + " + " + numero2 + "? ");
            respuesta = scanner.nextInt();

            // Comprobar si la respuesta es correcta
            if (respuesta == numero1 + numero2) {
                System.out.println("¡Correcto!\n");
                contador++; // aumentar contador de respuestas correctas
            } else {
                System.out.println("¡Incorrecto!");
                System.out.println("La respuesta correcta era: " + (numero1 + numero2));
                break; // salir del bucle al fallar
            }
        }

        System.out.println("\nHas realizado correctamente " + contador + " operaciones.");
        System.out.println("¡Gracias por jugar!");
    }
}
