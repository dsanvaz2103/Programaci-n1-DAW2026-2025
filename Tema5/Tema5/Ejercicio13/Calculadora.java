package Tema5.Ejercicio13;

import java.util.Random;

public final class Calculadora {

    // Constante 'final': No se puede modificar una vez inicializada
    public static final double FORMULA_SECRETA_COEFICIENTE = 1.618;

    // Constructor privado: Impide que se creen objetos de esta clase (como Math)
    private Calculadora() {}

    // --- SECCIÓN: CALCULADORA ---

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    // --- SECCIÓN: OPERACIONES "SECRETAS" ---

    /**
     * El modificador 'final' aquí asegura que el comportamiento
     * de este método es inalterable.
     */
    public static final int obtenerAlumnoAlazar(int totalAlumnos) {
        Random rand = new Random();
        // Lógica: devuelve un número entre 1 y el total de alumnos
        return rand.nextInt(totalAlumnos) + 1;
    }

    public static final double calcularPuntuacionJuego(int aciertos, int tiempoSegundos) {
        // Ejemplo de fórmula interna que nadie debería cambiar
        return (aciertos * FORMULA_SECRETA_COEFICIENTE) / (tiempoSegundos * 0.5);
    }
}