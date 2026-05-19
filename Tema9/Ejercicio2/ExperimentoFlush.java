package Tema9.Ejercicio2;
import java.io.FileWriter;

public class ExperimentoFlush {
    static void main(String[] args) throws Exception {
        // Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");

        // Escribimos algo
        escritor.write("¿Donde está mi texto?");

        // SOLUCIÓN: Forzamos el volcado y cerramos el flujo
        escritor.close();

        System.out.println("He escrito en el archivo... ¡y ahora SÍ está guardado!");

        // El programa se queda esperando aquí
        Thread.sleep(10000); // Espera 10 segundos
    }
}
