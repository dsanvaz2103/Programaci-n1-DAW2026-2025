package Tema9.Ejercicio12;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CreacionBorradoFichero {
    static void main() {
        File file = new File("abecedario.txt");

        // 1. Eliminar si ya existe para empezar de cero
        if (file.exists()) {
            file.delete();
            System.out.println("Fichero previo eliminado para reiniciar el ejercicio.");
        }

        try {
            // 2. Crear y abrir flujo de acceso aleatorio
            RandomAccessFile writer = new RandomAccessFile(file, "rw");

            // Introducir la cadena “defg”
            writer.writeBytes("defg");

            // 3. Imprimir contenido inicial (usamos seek(0) para volver al principio)
            writer.seek(0);
            byte[] buffer = new byte[(int) writer.length()];
            writer.readFully(buffer);
            System.out.println("Contenido en el fichero: " + new String(buffer));

            // 4. Añadir "abc" al principio y "hij" al final
            // Leemos lo que hay ahora
            writer.seek(0);
            String contenidoActual = new String(buffer);
            String nuevoContenido = "abc" + contenidoActual + "hij";

            // 5. Sustituir las vocales por “*”
            // Usamos un regex sencillo para cambiar a, e, i, o, u
            String contenidoFinal = nuevoContenido.replaceAll("[aeiouAEIOU]", "*");

            // Escribir el resultado final volviendo al inicio
            writer.setLength(0); // Borramos el contenido anterior del flujo
            writer.writeBytes(contenidoFinal);

            // Imprimir resultado final por curiosidad
            writer.seek(0);
            byte[] resultadoFinal = new byte[(int) writer.length()];
            writer.readFully(resultadoFinal);
            System.out.println("Contenido final con sustituciones: " + new String(resultadoFinal));

            // Siempre cerrar el flujo
            writer.close();

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Verificación final de propiedades del archivo
        if (file.exists()) {
            System.out.println("Nombre: " + file.getName());
            System.out.println("Ruta: " + file.getAbsolutePath());
        }
    }
}
