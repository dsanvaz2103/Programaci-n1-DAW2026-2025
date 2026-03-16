package Tema5.Ejercicio1;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Ingreso exitoso. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("Error: La cantidad a ingresar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser positiva.");
        } else if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("Error: Saldo insuficiente para realizar el retiro.");
        }
    }
}
