package Tema9.Ejercicio3;

import java.io.IOException;

public class Ejercicio3 {
    static void main() {
        byte b[] = new byte[5];
        try {
            System.in.read(b);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        String s = new String(b);
        System.out.println(s);
    }
    /*
        Este código cuenta cuántos caracteres introduce el usuario por teclado antes de pulsar la tecla Intro, e imprime ese número total por pantalla.
     */
}
