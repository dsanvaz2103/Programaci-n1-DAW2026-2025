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
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una nota (0 a 10): ");
        int nota = scanner.nextInt();

        // Usando switch como expresión
        String resultado = switch (nota) {
            case 0, 1, 2, 3, 4 -> "Insuficiente";
            case 5 -> "Suficiente";
            case 6 -> "Bien";
            case 7, 8 -> "Notable";
            case 9, 10 -> "Sobresaliente";
            default -> "Nota invalida. Debe estar entre 0 y 10.";
        };

        System.out.println(resultado);
    }
}
