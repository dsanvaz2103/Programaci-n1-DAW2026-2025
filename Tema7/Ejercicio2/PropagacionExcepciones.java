package Tema7.Ejercicio2;

import java.io.IOException;

public class PropagacionExcepciones {

    public static void main(String[] args) {
        System.out.println("--- INICIO DEL PROGRAMA ---");

        try {
            // Invocamos al método que propaga las excepciones
            double resultado = realizarDivision(10, 0);
            System.out.println("El resultado es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error capturado en Main: No se puede dividir por cero.");
        } catch (IOException e) {
            System.out.println("Error capturado en Main: Error de entrada/salida.");
        }

        System.out.println("--- FIN DEL PROGRAMA ---");
    }

    /**
     * El método propaga (throws) las excepciones hacia quien lo llamó.
     */
    public static double realizarDivision(int dividendo, int divisor) throws ArithmeticException, IOException {
        if (divisor == 0) {
            throw new ArithmeticException();
        }

        // Ejemplo hipotético de lanzamiento de IOException
        if (dividendo < 0) {
            throw new IOException("Dividendo negativo no permitido en este flujo.");
        }

        return (double) dividendo / divisor;
    }
}
