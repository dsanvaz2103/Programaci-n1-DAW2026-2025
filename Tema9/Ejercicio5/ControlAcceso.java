package Tema9.Ejercicio5;

import java.util.Scanner;

public class ControlAcceso {
    public static void main(String[] args) {
        // Definición de las credenciales correctas como constantes
        final String USER_CORRECTO = "admin";
        final String PASS_CORRECTO = "12345";

        Scanner teclado = new Scanner(System.in);
        int intentosMaximos = 3;
        int intentoActual = 1;
        boolean accesoConcedido = false;

        System.out.println(" SISTEMA DE ACCESO ");

        // El bucle se ejecutará mientras no tenga acceso y no haya agotado los intentos
        while (intentoActual <= intentosMaximos && !accesoConcedido) {
            System.out.println("\nIntento " + intentoActual + " de " + intentosMaximos);

            System.out.print("Introduce tu nombre de usuario: ");
            String usuario = teclado.nextLine();

            System.out.print("Introduce tu contraseña: ");
            String contrasena = teclado.nextLine();

            // Comparamos las cadenas usando .equals() (¡nunca uses == para Strings!)
            if (usuario.equals(USER_CORRECTO) && contrasena.equals(PASS_CORRECTO)) {
                accesoConcedido = true;
            } else {
                System.out.println(" Credenciales incorrectas. ");
                intentoActual++;
            }
        }

        // Bloque de resultado final

        if (accesoConcedido) {
            System.out.println(" ¡Acceso concedido! Bienvenido al sistema. ");
        } else {
            System.out.println(" Acceso bloqueado. Has agotado tus 3 intentos. ");
        }

        teclado.close();
    }
}