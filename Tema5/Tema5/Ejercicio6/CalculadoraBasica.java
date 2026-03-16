package Tema5.Ejercicio6;

public class CalculadoraBasica {

    // Atributos estáticos (opcional, p.ej. constantes)
    public static final double PI = 3.141592653589793;

    // Constructor privado para evitar que alguien instancie la clase
    private CalculadoraBasica() {}

    // Métodos públicos y estáticos
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}