package Tema7.Ejercicio3;

class Persona {
    private String nombre;
    private int edad;

    public void setEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            // Lanzamos la excepción manualmente
            throw new EdadInvalidaException("La edad no puede ser negativa: " + edad);
        }
        this.edad = edad;
        System.out.println("Edad establecida correctamente: " + edad);
    }
}
