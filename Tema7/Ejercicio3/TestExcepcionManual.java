package Tema7.Ejercicio3;

public class TestExcepcionManual {
    static void main(String[] args) {
        Persona p = new Persona();

        try {
            System.out.println("Intentando asignar edad -5...");
            p.setEdad(-5); // Esto provocará el salto al catch
        } catch (EdadInvalidaException e) {
            System.out.println("ERROR CAPTURADO: " + e.getMessage());
        }

        try {
            System.out.println("\nIntentando asignar edad 25...");
            p.setEdad(25); // Esto funcionará correctamente
        } catch (EdadInvalidaException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
