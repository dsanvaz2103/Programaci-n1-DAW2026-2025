package Tema9.Ejercicio14;

import Tema8.Persona;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Mochila {
    static void main() {
        List<Item> lista = new ArrayList<>();
        lista.add(new Item("Leche",2.3,9));
        lista.add(new Item("Coco",1.3,4));
        lista.add(new Item("Pan",7.5,3));
        lista.add(new Item("Cocacola",8.7,6));
        lista.add(new Item("Cacao",3.4,5));

        try{
            ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("mochila.bin"));
            ob.writeObject(lista);
            System.out.println("Lista guardada con éxito.");
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }

        try{
            ObjectInputStream ob = new ObjectInputStream(new FileInputStream("mochila.bin"));
            List<Item> listaRecuperada = (List<Item>) ob.readObject();

            double valorTotal = 0;
            System.out.println("\nContenido de la mochila:");
            for (Item it : listaRecuperada) {
                System.out.println("- " + it.getNombre() + ": " + it.getValor() + "€");
                valorTotal += it.getValor();
            }

            System.out.println("VALOR TOTAL DE LA MOCHILA: " + valorTotal + "€");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }

    /*
        4. Reflexiona: ¿Qué pasa si intentas guardar un objeto que NO es Serializable?

        Que nos da error y no nos dejaria guardarlo, por ello tenemos que utilizar el transient
     */
}
