package Tema9.Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class EjercicioPipedWriter {
    static void main(String[] args) {
        try {
            // 1. Instanciamos los flujos de caracteres para la tubería
            final PipedWriter escritorTubo = new PipedWriter();
            final PipedReader lectorTubo = new PipedReader();

            // 2. Conectamos el escritor con el lector
            escritorTubo.connect(lectorTubo);

            // HILO ESCRITOR (Envía el texto)
            Thread hiloEscritor = new Thread(() -> {
                try {
                    // Enviamos un mensaje que contiene una sección que querremos releer
                    String mensaje = "INICIO_DATOS:[SECRETO_99]:FIN_DATOS";
                    System.out.println("[Escritor] Enviando texto por el tubo...");
                    escritorTubo.write(mensaje);
                    escritorTubo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // HILO LECTOR (Recibe el texto y usa mark/reset)
            Thread hiloLector = new Thread(() -> {
                try {
                    // PipedReader no soporta mark/reset por sí mismo.
                    // Lo envolvemos en un BufferedReader que sí añade esta capacidad mediante un buffer en memoria.
                    BufferedReader lectorBuffer = new BufferedReader(lectorTubo);

                    System.out.println("[Lector] Esperando caracteres...");

                    // Leyendo los primeros caracteres "INICIO_DATOS:"
                    for (int i = 0; i < 13; i++) {
                        System.out.print((char) lectorBuffer.read());
                    }

                    System.out.println("\n[Lector] ¡Ponemos un marcapáginas aquí con mark()!");
                    // Marcamos la posición actual. Permitimos leer hasta 20 caracteres hacia adelante antes de perder la marca.
                    lectorBuffer.mark(20);

                    System.out.print("[Lector] Leyendo contenido marcado: ");
                    // Leemos el código secreto "[SECRETO_99]"
                    for (int i = 0; i < 12; i++) {
                        System.out.print((char) lectorBuffer.read());
                    }

                    System.out.println("\n[Lector] Usamos reset() para volver al marcapáginas.");
                    // Rebobinamos el flujo hasta la marca
                    lectorBuffer.reset();

                    System.out.print("[Lector] Volviendo a leer desde la marca hasta el final: ");
                    int caracter;
                    while ((caracter = lectorBuffer.read()) != -1) {
                        System.out.print((char) caracter);
                    }
                    System.out.println();

                    lectorBuffer.close();
                } catch (IOException e) {
                    System.out.println("El flujo no soporta mark/reset o hubo un error.");
                    e.printStackTrace();
                }
            });

            // Arrancamos los hilos
            hiloEscritor.start();
            hiloLector.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
