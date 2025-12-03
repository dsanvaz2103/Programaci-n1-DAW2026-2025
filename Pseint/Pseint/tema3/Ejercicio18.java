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
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número decimal
        System.out.print("Ingrese un numero decimal: ");
        double numero = scanner.nextDouble();

        // Comprobar si es un número casi-cero
        if (numero != 0 && Math.abs(numero) < 1) {
            System.out.println(numero + " es un numero casi-cero.");
        } else {
            System.out.println(numero + " no es un numero casi-cero.");
        }
    }
}
