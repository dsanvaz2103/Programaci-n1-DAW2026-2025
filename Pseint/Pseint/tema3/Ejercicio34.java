package EjerciciosEclipse;

import java.util.Scanner;

public class Ejercicio34 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int altura;
        int maxAltura = -1;
        int idMax = -1;
        int idActual = 0;

        System.out.print("Introduce la altura del árbol (cm), o -1 para terminar: ");
        altura = scan.nextInt();

        while (altura != -1) {

            if (altura > maxAltura) {
                maxAltura = altura;
                idMax = idActual;
            }

            idActual++;  // pasamos al siguiente árbol

            System.out.print("Introduce la altura del árbol (cm), o -1 para terminar: ");
            altura = scan.nextInt();
        }

        if (maxAltura == -1) {
            System.out.println("No se introdujeron datos.");
        } else {
            System.out.println("El árbol más alto es el árbol con ID " + idMax +
                               " y una altura de " + maxAltura + " cm.");
        }
	}
}
