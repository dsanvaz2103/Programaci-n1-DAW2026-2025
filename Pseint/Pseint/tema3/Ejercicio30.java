package EjerciciosEclipse;

import java.util.Scanner;

public class Ejercicio30 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce un número: ");
	        int n = sc.nextInt();

	        for (int i = n; i >= 1; i--) {  // De n a 1
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	 }
}
