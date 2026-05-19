package Tema9.Ejercicio6;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class EjercicioPipedOutputStream {
    static void main(String[] args) {
        try {
            // 1. Creamos los dos extremos de la tubería
            final PipedOutputStream salida = new PipedOutputStream();
            final PipedInputStream entrada = new PipedInputStream();

            // 2. ¡CONECTAMOS la tubería!
            salida.connect(entrada);

            // 3. HILO PRODUCTOR: El que escribe datos en el PipedOutputStream
            Thread hiloProductor = new Thread(() -> {
                try {
                    String mensaje = "¡Hola clase! Este mensaje viaja por una tubería de hilos.";
                    System.out.println("[Productor] Escribiendo en el tubo...");

                    // Convertimos el texto a bytes y lo enviamos
                    salida.write(mensaje.getBytes());
                    salida.close(); //cerramos el hilo
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // 4. HILO CONSUMIDOR: El que lee datos del PipedInputStream
            Thread hiloConsumidor = new Thread(() -> {
                try {
                    System.out.println("[Consumidor] Esperando a que lleguen datos...");
                    int dato;

                    System.out.print("[Consumidor] Mensaje recibido: ");
                    // Lee byte a byte hasta que el productor cierre el flujo (-1)
                    while ((dato = entrada.read()) != -1) {
                        System.out.print((char) dato);
                    }
                    System.out.println();
                    entrada.close(); //cerramos el hilo
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // 5. Arrancamos ambos hilos a la vez
            hiloProductor.start();
            hiloConsumidor.start();

        } catch (IOException e) {
            System.out.println("Error al conectar los flujos.");
            e.printStackTrace();
        }
    }
}
