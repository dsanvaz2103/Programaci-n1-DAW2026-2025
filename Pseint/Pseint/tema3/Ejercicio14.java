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
public class Ejercicio14 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        // Solicitar notas al usuario
        System.out.print("Ingrese la nota del primer trimestre: ");
        int nota1 = scan.nextInt();

        System.out.print("Ingrese la nota del segundo trimestre: ");
        int nota2 = scan.nextInt();

        System.out.print("Ingrese la nota del tercer trimestre: ");
        int nota3 = scan.nextInt();

        // Calcular la media
        double media = (nota1 + nota2 + nota3) / 3.0;

        // Mostrar la media según el boletín (solo parte entera)
        int mediaBoletin = (int) media;
        System.out.println("Media según el boletín (solo parte entera): " + mediaBoletin);

        // Mostrar la media según el expediente académico (con decimales)
        System.out.println("Media según el expediente académico (con decimales): " + media);
    }
}
