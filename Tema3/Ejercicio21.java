package EjerciciosEclipse;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);

	        // Pedimos al usuario que ingrese el número del mes
	        System.out.print("Ingrese el número del mes (1-12): ");
	        int mes = scan.nextInt();

	        // Comprobamos cuántos días tiene
	        switch(mes) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                System.out.println("El mes tiene 31 días");
	                break;
	            case 4: case 6: case 9: case 11:
	                System.out.println("El mes tiene 30 días");
	                break;
	            case 2:
	                System.out.println("El mes tiene 28 o 29 días");
	                break;
	            default:
	                System.out.println("Número de mes inválido");
	        }
	}

}
