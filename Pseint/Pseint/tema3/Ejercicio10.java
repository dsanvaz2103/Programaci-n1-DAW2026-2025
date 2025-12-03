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
public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Precios por kilo
        final double PRECIO_MANZANAS = 2.35;
        final double PRECIO_PERAS = 1.95;

        // Pedir ventas de manzanas
        System.out.print("Ventas de manzanas (Semestre en kg): ");
        double manzanas1 = scan.nextDouble();

        System.out.print("Ventas de manzanas (Segundo semestre en kg): ");
        double manzanas2 = scan.nextDouble();

        // Pedir ventas de peras
        System.out.print("Ventas de peras (Semestre en kg): ");
        double peras1 = scan.nextDouble();

        System.out.print("Ventas de peras (Segundo semestre en kg): ");
        double peras2 = scan.nextDouble();

        // Cálculo total
        double totalManzanas = (manzanas1 + manzanas2) * PRECIO_MANZANAS;
        double totalPeras = (peras1 + peras2) * PRECIO_PERAS;
        double totalGeneral = totalManzanas + totalPeras;

        // Mostrar resultados
        System.out.println("\n==== RESULTADOS ====");
        System.out.println("Beneficio anual por manzanas: " + totalManzanas + " €");
        System.out.println("Beneficio anual por peras: " + totalPeras + " €");
        System.out.println("Beneficio total anual: " + totalGeneral + " €");
    }
}
