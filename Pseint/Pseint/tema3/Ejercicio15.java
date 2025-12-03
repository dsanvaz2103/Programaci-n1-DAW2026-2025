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
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número decimal
        System.out.print("Ingrese un numero decimal: ");
        double numeroDecimal = scanner.nextDouble();

        // Redondear el número al entero más cercano
        long numeroRedondeado = Math.round(numeroDecimal);

        // Mostrar el resultado
        System.out.println("El numero " + numeroDecimal + " redondeado al entero mas cercano es " + numeroRedondeado);
    }
}
