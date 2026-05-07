package Tema9.Ejercicio1;

import java.util.Scanner;

public class ImpresionCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 4 caracteres (puedes separarlos por espacios o Enter):");

        // Leemos los 4 caracteres
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        char c3 = sc.next().charAt(0);
        char c4 = sc.next().charAt(0);

        // 1. Imprimir el primero con write
        // write recibe un entero  y requiere manejar excepciones o hacer flush
        System.out.write(c1);
        System.out.flush(); // Es necesario para que se muestre en consola inmediatamente

        // Añadimos un salto de línea manual para que no se amontone lo siguiente
        System.out.println();

        // 2. Imprimir el segundo con print
        System.out.print(c2);

        // 3. Imprimir el tercero con println
        // Esto imprimirá el carácter y saltará a la siguiente línea
        System.out.println(c3);

        // 4. Imprimir el cuarto con printf
        // Usamos el especificador de formato %c para caracteres
        System.out.printf("%c%n", c4);

        sc.close();
    }
}
