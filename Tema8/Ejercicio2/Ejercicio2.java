package Tema8.Ejercicio2;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        List lista = new  ArrayList();
        lista.add(7);
        lista.add(2);
        lista.add(7);
        lista.add(5);
        System.out.println(lista);

        int[] array = new int[4];
        array[0] = 7;
        array[1] = 2;
        array[2] = 7;
        array[3] = 5;
        System.out.println(array);

        // 2 Copiamos la lista
        List listaLink = new LinkedList(lista);

        System.out.println("Copiando " + listaLink);

        // 3 Sustituimos el elemento 1 y el uultimo elemento
        if (!listaLink.isEmpty()){
            int indicePrimero = 0;
            int indiceUltimo = listaLink.size() - 1;

            Collections.swap(listaLink,indicePrimero,indiceUltimo);
        }
        System.out.println("Lista cambiada " + listaLink);
    }
}
