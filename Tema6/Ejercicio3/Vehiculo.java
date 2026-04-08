package Tema6.Ejercicio3;

import Tema5.Ejercicio11.Libro;

import java.util.Objects;

public abstract class Vehiculo implements Maintenance {
    private String licensePlate;
    private String brand;
    private int year;
    private FuelType fuelType;
    private static int vehicleCount = 0;

    public Vehiculo(String licensePlate, String brand, int year, FuelType fuelType) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.fuelType = fuelType;
        vehicleCount++;
    }

    // Metodo abstracto (segun el diagrama parece serlo ya que Car/Motorcycle lo sobreescriben)
    public abstract double calculateSpeed();

    protected String getVehicleInfo() {
        return "Brand: " + brand + ", Plate: " + licensePlate;
    }

    protected static int getTotalVehicles() {
        return vehicleCount;
    }

    protected String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    public static void setVehicleCount(int vehicleCount) {
        Vehiculo.vehicleCount = vehicleCount;
    }



    @Override
    public String toString() {
        return "Vehicle [Plate=" + licensePlate + ", Brand=" + brand + "]";
    }

    @Override
    public boolean equals(Object obj) {
        // Si apuntan a la misma dirección de memoria
        if (this == obj) return true;

        // Si el objeto es nulo o no es de la misma clase
        if (obj == null || getClass() != obj.getClass()) return false;

        // Conversión (cast) y comparación del atributo clave
        Vehiculo otroVehiculo = (Vehiculo) obj;
        return Objects.equals(this.licensePlate, otroVehiculo.licensePlate);
    }


}