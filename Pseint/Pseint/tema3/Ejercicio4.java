/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author 17_1DAW_Alum
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        short max = 32767;
        short min = -32768;

        // Comprobación de comportamiento cíclico
        short siguienteAlMax = (short) (max + 1);

        System.out.println("Valor maximo del tipo short: " + max);
        System.out.println("Valor minimo del tipo short: " + min);
        System.out.println("Valor siguiente al maximo (32767 + 1): " + siguienteAlMax);

        if (siguienteAlMax == min) {
            System.out.println("El tipo short es ciclico: despues del maximo viene el minimo.");
        } else {
            System.out.println("El tipo short NO es ciclico.");
        }
    }
}
