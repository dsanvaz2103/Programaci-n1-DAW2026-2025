package Tema5.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        // Creamos el array de tipo Empleado (la base)
        Empleado[] nomina = new Empleado[2];

        // Llenamos el array con diferentes tipos (Polimorfismo de asignación)
        nomina[0] = new EmpleadoFijo("Ana García", 2500.0);
        nomina[1] = new EmpleadoPorHoras("Luis Pérez", 40, 20.0);

        // Recorremos la lista sin usar instanceof ni if
        for (Empleado emp : nomina) {
            System.out.println("Nombre: " + emp.getNombre() +
                    " - Salario: " + emp.calcularSalario());
        }
    }
}
