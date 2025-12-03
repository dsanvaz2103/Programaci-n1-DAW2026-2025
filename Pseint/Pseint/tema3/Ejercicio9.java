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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print(" ¿Esta lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();

        System.out.print("¿Has terminado tus tareas? (true/false): ");
        boolean tareasTerminadas = sc.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean irBiblioteca = sc.nextBoolean();

        // Lógica para decidir si puede salir
        boolean puedeSalir = (!llueve && tareasTerminadas) || irBiblioteca;

        // Mostrar resultado
        System.out.println("¿Puedes salir a la calle?: " + puedeSalir);

    }
}
