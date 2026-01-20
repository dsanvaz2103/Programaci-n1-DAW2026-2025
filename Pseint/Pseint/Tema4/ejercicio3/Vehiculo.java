package Tema4.ejercicio3;

public class Vehiculo {
    String matricula;
    String marca;
    int anioFabricacion;
    double precio;
    TipoVehiculo tipo;

    Vehiculo(String matricula, String marca, int anioFabricacion, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    Vehiculo(String matricula, String marca, int anioFabricacion, double precio, TipoVehiculo tipo) {
        this(matricula, marca, anioFabricacion, precio);
        this.tipo = tipo;
    }
}
