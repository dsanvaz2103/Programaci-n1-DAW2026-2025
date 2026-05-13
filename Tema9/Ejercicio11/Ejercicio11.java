package Tema9.Ejercicio11;

import java.io.*;
import java.util.Scanner;

public class Ejercicio11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String nivel;
        File file = new File("record.txt");
        try {
            RandomAccessFile record = new RandomAccessFile(file,"rw");
            System.out.println(file.getName());
            System.out.println(file.getAbsoluteFile());
            record.writeBytes("Nivel:001");
            record.seek(6);
            record.writeBytes("005");
        }catch (IOException e){
            e.printStackTrace();
        }

        // 2. LEER del archivo
        try (FileReader lector = new FileReader(file)) {
            int i;
            System.out.print("Contenido leído: ");
            // Lee carácter por carácter hasta el final (-1)
            while ((i = lector.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
