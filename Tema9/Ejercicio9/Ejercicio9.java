package Tema9.Ejercicio9;

import java.io.File;
import java.io.IOException;

public class Ejercicio9 {
    static void main() {
        File file = new File("notas.txt");
        if (file.exists()){
            // Si existe imprimir nombre y ruta absoluta
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
        }else {
            System.out.println("El archivo no existe");
        }

        try {
            if (file.createNewFile()){
                System.out.println(file.getName());
                System.out.println(file.getAbsolutePath());
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

}
