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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.141592653589793;

        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        double longitud = 2 * PI * radio;
        double area = PI * radio * radio;

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Area de la circunferencia: " + area);
    }
}
