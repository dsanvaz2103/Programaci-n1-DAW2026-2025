package Tema5.Ejercicio13;

public class CalculadoraApp {
    public static void main(String[] args) {
        double a = 10, b = 5;

        // Uso de utilidades matemáticas
        double suma = Calculadora.sumar(a, b);

        // Uso de utilidades "secretas"
        int elegido = Calculadora.obtenerAlumnoAlazar(25);
        double puntos = Calculadora.calcularPuntuacionJuego(10, 120);

        System.out.println("Suma: " + suma);
        System.out.println("Alumno premiado hoy: " + elegido);
        System.out.println("Puntuación final: " + puntos);
    }
}
