/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author 17_1DAW_Alum
 */
public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce la primera nota (entera): ");
        int nota1 = scan.nextInt();

        System.out.print("Introduce la segunda nota (entera): ");
        int nota2 = scan.nextInt();

        // Cálculo de la media (con conversión a double para permitir decimales)
        double media = (nota1 + nota2) / 2.0;

        System.out.println("La media aritmética es: " + media);
    }
}
