package EjerciciosEclipse;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Instroduzca cuantas veces quieren que te saluden: ");
		n = scan.nextInt();
		variosSaludos(n);
		dobleSaludos(n);
	}
	
	public static void variosSaludos(int i) {
		for(int j = 1; j <= i; j++) {
			System.out.println("Hola");
		}
	}
	
	
	// Función de amplicación
	
	public static void dobleSaludos(int i) {
		for(int j = 1; j <= i * 2; j++) {
			System.out.println("Hola X2");
		}
	}
}
