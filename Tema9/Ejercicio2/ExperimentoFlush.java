package Tema9.Ejercicio2;
import java.io.FileWriter;


public class ExperimentoFlushCorregido {
    public static void main(String[] args) throws Exception {
        
        // Al declararlo dentro del try, Java lo cerrará solo al final
        try (FileWriter escritor = new FileWriter("prueba.txt")) {
            
            escritor.write("¿Donde está mi texto? ¡Ahora sí está aquí!");
            System.out.println("He escrito en el búfer...");
            
            // Si miras el archivo AQUÍ, seguirá vacío porque no ha salido del bloque try
            System.out.println("Esperando 5 segundos antes de cerrar el bloque try...");
            Thread.sleep(5000); 
        } 
        // ¡AQUÍ YA SE CERRÓ AUTOMÁTICAMENTE!
        
        System.out.println("El archivo se ha cerrado. Comprueba 'prueba.txt' ahora.");
        Thread.sleep(10000); // Si miras el archivo ahora, verás el texto perfectamente.
    }
}
