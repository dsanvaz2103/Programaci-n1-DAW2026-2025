package Tema5.Ejercicio7.Concesionario;

class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(" - Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }

    @Override
    public void movimiento() {
        System.out.println("La motocicleta está en movimiento.");
    }
}