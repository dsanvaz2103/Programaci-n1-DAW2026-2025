package Tema5.Ejercicio4;

public class ContadorObjeto {
    // Atributo estático: compartido por todas las instancias
    private static int totalObjetos = 0;

    // Constructor: se ejecuta cada vez que hacemos "new ContadorObjetos()"
    public ContadorObjeto() {
        totalObjetos++; // Incrementamos el contador global
    }

    // Método estático: se puede llamar usando el nombre de la clase
    public static void mostrarTotalObjetos() {
        System.out.println("Número total de objetos creados hasta ahora: " + totalObjetos);
    }
}