package EjerciciosEclipse;

public class Ejercicio32 {

	public static void main(String[] args) {
		 int x = 8;
	        int y = 15;

	        int resultado = maximo(x, y);

	        // Imprimir el valor devuelto
	        System.out.println("El máximo es: " + resultado);
	}

	// Función que devuelve el máximo de dos enteros
    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
