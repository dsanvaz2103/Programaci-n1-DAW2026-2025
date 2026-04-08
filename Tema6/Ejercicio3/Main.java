package Tema6.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos algunos vehículos (Carros y Motos)
        Vehiculo coche1 = new Car("ABC-123", "Toyota", 2022, FuelType.HYBRID, 4);
        Vehiculo coche2 = new Car("XYZ-789", "Tesla", 2023, FuelType.ELECTRIC, 2);

        Vehiculo miMoto = new Motorcycle("MOT-001", "Yamaha", 2021, FuelType.GASOLINE, false);
        Vehiculo motoConSidecar = new Motorcycle("SID-999", "Harley", 2020, FuelType.GASOLINE, true);

        // 2. Mostramos información individual de los vehículos
        System.out.println("--- Información de los vehículos ---");
        System.out.println(coche1.toString());
        System.out.println("Velocidad: " + coche1.calculateSpeed() + " km/h");
        System.out.println("Mantenimiento: " + coche1.nextMaintenanceDate());

        System.out.println("\n" + miMoto.toString());
        System.out.println("Velocidad: " + miMoto.calculateSpeed() + " km/h");
        System.out.println("Mantenimiento: " + miMoto.nextMaintenanceDate());

        System.out.println("\n" + coche2.toString());
        System.out.println("Velocidad: " + coche2.calculateSpeed() + " km/h");
        System.out.println("Mantenimiento: " + coche2.nextMaintenanceDate());

        System.out.println("\n" + motoConSidecar.toString());
        System.out.println("Velocidad: " + motoConSidecar.calculateSpeed() + " km/h");
        System.out.println("Mantenimiento: " + motoConSidecar.nextMaintenanceDate());

        System.out.println("\n------------------------------------");

        // 3. Mostramos el total de vehículos creados
        // Usamos el metodo estático directamente de la clase Vehicle

        int total = Vehiculo.getTotalVehicles();

        System.out.println("TOTAL DE VEHÍCULOS REGISTRADOS: " + total);
    }
}
