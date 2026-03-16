package Tema5.Ejercicio6;

public class AppPrincipal {
    public static void main(String[] args) {
        // Al ser estático, no usamos "new"
        double resultado = CalculadoraBasica.sumar(10.5, 5.5);
        System.out.println("El resultado es: " + resultado);
    }
}
