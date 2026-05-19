package Tema9.Ejercio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestionFichero {
    public static void main(String[] args) {
        String nombreFichero = "ejercicio8.txt";

        // 1. Añadir contenido al final del archivo
        // El segundo parámetro 'true' en FileWriter activa el modo append (añadir)
        try (FileWriter fw = new FileWriter(nombreFichero, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.newLine(); // Crea una nueva línea antes de escribir
            bw.write("Texto añadido desde el programa de Java.");
            System.out.println("Contenido añadido correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }



        // 2. Leer y mostrar el contenido del archivo por consola
        try (FileReader fr = new FileReader(nombreFichero);
             BufferedReader br = new BufferedReader(fr)) {

            System.out.println("Contenido actual del archivo:");
            String linea;

            // Lee el archivo línea por línea hasta que no haya más contenido (null)
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}