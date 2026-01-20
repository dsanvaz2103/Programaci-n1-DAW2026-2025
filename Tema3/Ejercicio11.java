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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double num1 = scan.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = scan.nextDouble();

        // Uso del operador ternario
        double mayor = (num1 > num2) ? num1 : num2;

        System.out.println("El numero mayor es: " + mayor);
    }
}
