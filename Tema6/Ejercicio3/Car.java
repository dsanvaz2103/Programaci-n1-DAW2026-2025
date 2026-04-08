package Tema6.Ejercicio3;

public class Car extends Vehiculo {
    private int numberOfDoors;

    public Car(String licensePlate, String brand, int year, FuelType fuelType, int numberOfDoors) {
        super(licensePlate, brand, year, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateSpeed() {
        // Ejemplo de lógica: un carro tiene un factor de velocidad base
        return 180.0;
    }

    @Override
    public String nextMaintenanceDate() {
        return "Service in 6 months for car: " + getLicensePlate();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + " - Car [Puertas=" + numberOfDoors + "]";
    }
}