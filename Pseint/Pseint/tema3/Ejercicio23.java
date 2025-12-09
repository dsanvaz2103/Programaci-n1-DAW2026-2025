package EjerciciosEclipse;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     Random random = new Random();

	        // Generar dos números aleatorios a y b
	        int a = random.nextInt(101); // números entre 0 y 100
	        int b = random.nextInt(101);

	        // Asegurarse de que a sea menor que b
	        if (a > b) {
	            int temp = a;
	            a = b;
	            b = temp;
	        }

	        int numero;
	        do {
	            // Pedir un número entero al usuario
	            System.out.print("Ingrese un numero entero: ");
	            numero = scanner.nextInt();

	            // Mostrar siempre el número introducido
	            System.out.println("Numero introducido: " + numero);

	            // Comprobar si el número está dentro del rango [a, b]
	            			if (numero >= a && numero <= b) {
	                System.out.println("¡El numero esta dentro del rango!");
	                System.out.println("Los valores del rango eran: a = " + a + ", b = " + b);
	            } else {
	                System.out.println("El numero NO está dentro del rango. Intente de nuevo.");
	            }
	        } while (numero < a || numero > b); // repetir hasta acertar
	   }
}

