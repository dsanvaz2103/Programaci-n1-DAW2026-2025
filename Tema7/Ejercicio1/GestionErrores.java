package Tema7.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionErrores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("COMIENZO PROGRAMA DIVISIÓN");

        try {
            System.out.print("Introduce el dividendo: ");
            int dividendo = sc.nextInt();

            System.out.print("Introduce el divisor: ");
            int divisor = sc.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Imposible dividir por 0");
            System.out.println("Mensaje de la excepción: " + e.getMessage());
            e.printStackTrace(); // Muestra la traza del error

        } catch (InputMismatchException e) {
            System.out.println("Error: Has introducido letras en lugar de números.");

        } finally {
            // El flujo se cerraría aquí
            System.out.println("Cerrando recursos...");
            sc.close();
            System.out.println("FIN PROGRAMA DIVISIÓN");
        }
    }
}