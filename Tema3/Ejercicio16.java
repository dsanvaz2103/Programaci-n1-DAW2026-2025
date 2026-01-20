/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 17_1DAW_Alum
 */
public class Ejercicio16 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar dos números aleatorios a y b
        int a = random.nextInt(101); // números entre 0 y 100
        int b = random.nextInt(101);

        // Asegurarse de que a sea menor que b
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Pedir un número entero al usuario
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        // Comprobar si el número está dentro del rango [a, b]
        if (numero >= a && numero <= b) {
            System.out.println("El numero esta dentro del rango.");
            System.out.println("Los valores del rango eran: a = " + a + ", b = " + b);
        }

        // Mostrar siempre el número introducido
        System.out.println("Numero introducido: " + numero);
     }
}
