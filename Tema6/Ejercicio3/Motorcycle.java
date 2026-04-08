package Tema6.Ejercicio3;

public class Motorcycle extends Vehiculo {
    private boolean hasSidecar;

    public Motorcycle(String licensePlate, String brand, int year, FuelType fuelType, boolean hasSidecar) {
        super(licensePlate, brand, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateSpeed() {
        // Ejemplo de lógica: las motos suelen ser más rápidas o ligeras
        return 220.0;
    }

    @Override
    public String nextMaintenanceDate() {
        return "Service in 3 months for motorcycle: " + getLicensePlate();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return " - Motorcycle [Sidecar=" + hasSidecar + "]";
    }
}