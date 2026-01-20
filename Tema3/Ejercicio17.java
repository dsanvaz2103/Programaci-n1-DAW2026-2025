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
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales.");
        } else {
            System.out.println("Los numeros no son iguales.");
        }
    }
}
