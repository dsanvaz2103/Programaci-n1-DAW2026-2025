package Tema9.Ejercicio3;

import java.io.IOException;

import java.util.Scanner;

public class EntradaCaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Paso 1 y 2: Instrucciones al usuario
        System.out.println("Introduzca varios caracteres y después pulse intro para finalizar");
        String caracteres = teclado.nextLine(); 

        // Paso 3: Hola Mundo personalizado
        System.out.println("Introduzca su nombre");
        String nombre = teclado.nextLine();
        
        System.out.println("Hola " + nombre + "!");
        
        teclado.close();
    }
}
