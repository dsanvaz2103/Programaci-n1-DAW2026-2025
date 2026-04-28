package Tema8.Ejercicio13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class InventarioFruteria {
    static void main() {
        Map<String,Integer> frutas = new HashMap<>();
        frutas.put("Naranja",23);
        frutas.put("Manzana",33);
        frutas.put("Peras",24);
        frutas.put("Platano",56);
        System.out.println(frutas.get("Naranja"));
        frutas.put("Manzana",100);
        System.out.println(frutas.get("Manzana"));
        if (frutas.containsKey("Mango")){
            System.out.println("La fruta" + frutas.get("Mango") + " existe");
        }else {
            System.out.println("Producto no encontrado");
        }

        Set<String> clave = frutas.keySet();

        for (String k: clave){
            System.out.println(frutas.get(k));
        }
        System.out.println(frutas);

        //Recorrerlo con un Iterador

        Iterator<Map.Entry<String, Integer>> it = frutas.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entrada = it.next();
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
        /*
        Después de actualizar el número de "Manzanas", ¿aparecen dos entradas diferentes o se ha sobrescrito la anterior? ¿Por qué crees que ocurre esto?
        Se sobre escribe ya que lo que hace es machacarlo

        ¿Qué pasaría si intentas usar un número entero (int) como clave en lugar de un String?


        ¿Por qué es más eficiente usar un Map que una ArrayList para este caso específico de un inventario?
        Por que en los Arrays tendrias que utilizar un Array de dos dimensiones y aparte a la hora de actualizar añadr o lo que sea es mas molesto a la hora de hacerlo

         */
    }
}
