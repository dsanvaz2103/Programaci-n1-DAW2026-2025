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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fechaNacimiento = 0;
        int anioActual = 0;
        System.out.println("Introduzca el anio actual");
        anioActual = scan.nextInt();
        System.out.println("Introduzca tu fecha de nacimiento");
        fechaNacimiento = scan.nextInt();
        int edad = fechaNacimiento - anioActual;
        System.out.println("La edad del usuarios es " + Math.abs(edad));
        
    }
}
