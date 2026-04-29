package UD8.EjerciciosRefuerzo.Ejercicio7;

import java.util.HashMap;
import java.util.Map;

public class ContadorFrecuencias {
    public static void main(String[] args) {
        // 1. Texto de prueba
        String texto = "Java es un lenguaje de programación y Java es muy potente y Java es genial";

        // 2. Convertir a minúsculas y dividir por espacios
        String[] palabras = texto.toLowerCase().split("\\s+");

        // 3. Crear el HashMap para almacenar <Palabra, Contador>
        Map<String, Integer> frecuencias = new HashMap<>();

        // 4. Lógica de conteo
        for (String p : palabras) {
            if (frecuencias.containsKey(p)) {
                // Si ya existe, cogemos el valor actual y sumamos 1
                frecuencias.put(p, frecuencias.get(p) + 1);
            } else {
                // Si es la primera vez que aparece
                frecuencias.put(p, 1);
            }
        }

        // 5. Imprimir resultados
        System.out.println("--- Frecuencia de palabras ---");
        for (Map.Entry<String, Integer> entrada : frecuencias.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
