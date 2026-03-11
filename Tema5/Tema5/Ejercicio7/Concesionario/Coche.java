package Tema5.Ejercicio7.Concesionario;

class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" - Puertas: " + numPuertas);
    }

    @Override
    public void movimiento() {
        System.out.println("El coche está en movimiento.");
    }
}
