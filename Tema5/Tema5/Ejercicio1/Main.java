package Tema5.Ejercicio1;

public class Main {
    static void main() {
        CuentaBancaria miCuenta = new CuentaBancaria("Alex", 1000.0);

        miCuenta.ingresar(500.0);   // Saldo: 1500.0
        miCuenta.retirar(2000.0);  // Error: Saldo insuficiente
        miCuenta.retirar(300.0);   // Saldo: 1200.0

        System.out.println("Titular: " + miCuenta.getTitular());
        System.out.println("Saldo final: " + miCuenta.getSaldo());
    }
}
