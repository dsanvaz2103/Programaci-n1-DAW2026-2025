package UD8.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class GestionNotas {

    public static void main(String[] args) {
        // 1. Datos de entrada String
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        // 2. Crear ArrayList de tipo Double
        List<Double> listaNotas = new ArrayList<>();

        // 3. Conversión  de String a Double
        for (String notaTexto : notasEntrada) {
            // Convertimos el String a Double y lo añadimos a la lista
            listaNotas.add(Double.parseDouble(notaTexto));
        }

        // 4. Cálculo de la nota media
        double suma = 0;
        for (Double nota : listaNotas) {
            suma += nota;
        }
        double media = suma / listaNotas.size();

        // 5. Filtrado de aprobados
        List<Double> aprobados = new ArrayList<>();
        for (Double nota : listaNotas) {
            if (nota >= 5.0) {
                aprobados.add(nota);
            }
        }

        //Mostrar Resultados
        System.out.println("Todas las notas: " + listaNotas);
        System.out.printf("Nota media de la clase: %.2f%n", media);
        System.out.println("Lista de aprobados (>= 5.0): " + aprobados);
    }
}
