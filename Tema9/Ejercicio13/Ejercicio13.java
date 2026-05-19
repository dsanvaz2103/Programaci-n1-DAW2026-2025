package Tema9.Ejercicio13;

import java.io.*;

public class Ejercicio13 {
    static void main() {
        Direccion d = new Direccion("Caca","papa");
        Persona personaFamosa = new Persona("Logan", "Reinos",d);
        try {
            FileOutputStream fi = new FileOutputStream("personaFamosa.dat");
            ObjectOutputStream ob = new ObjectOutputStream(fi);
            ob.writeObject(personaFamosa);
            ob.close();

            System.out.println("Persona guardada... ");
        } catch (IOException e) {
            System.out.println("Error al guardar");
        }

        try {
            FileInputStream fi = new FileInputStream("personaFamosa.dat");
            ObjectInputStream ob = new ObjectInputStream(fi);
            Persona p = (Persona) ob.readObject();
            ob.close();

            System.out.println("Persona leida: ");
            System.out.println(p.getNombre() + " " + p.getApellido());
        }catch (IOException e){
            System.out.println("Error al leer");
        }catch (ClassNotFoundException e){
            System.out.println("Clase no encontrada");
        }
    }
}
