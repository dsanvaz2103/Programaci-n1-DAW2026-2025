package Tema6.Ejercicio1.Animales;

public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        Pajaro miPajaro = new Pajaro();
        PerroDeAgua perro = new PerroDeAgua();

        perro.mostrarInfo();
        perro.hacerSonido();
        perro.correr();

        miPerro.mostrarInfo();
        miPerro.hacerSonido();
        miPerro.correr();

        System.out.println("---");

        miPajaro.mostrarInfo();
        miPajaro.volar();
    }
}