package EjerciciosEclipse;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner scan = new Scanner(System.in);
	   int numero;

	   do {
		  System.out.println("Introduzca un número: ");
		  numero = scan.nextInt();
		  
	   if (numero == 0) {
	      System.out.println("Saliendo...");
		  break;
	   }
	   if (numero % 2 == 0) {
		 System.out.println(numero + " es par");
	   } else {
		 System.out.println(numero + " es impar");
	   }
	   if (numero > 0) {
		 System.out.println(numero + " es positivo");
	   } else {
		 System.out.println(numero + " es negativo");
	   }
	   System.out.println("Su cuadrado es: " + (numero * numero));

	  } while (true);
	 }
	}
