package Tema5.Ejercicio7.Concesionario;
import Tema5.Ejercicio7.Clases.Alumno;

public class Main {
    static void main() {
        System.out.println("---");

        //Objetos Vehiculos
        Coche miCoche = new Coche("Toyota", "Corolla", 2022, 5);
        Motocicleta miMoto = new Motocicleta("Honda", "CBR", 2021, false);

        miCoche.mostrarDetalles();
        miCoche.movimiento();

        System.out.println();

        miMoto.mostrarDetalles();
        miMoto.movimiento();
    }
}
