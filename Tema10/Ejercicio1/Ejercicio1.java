package Tema10.Ejercicios.Ejercicio1;

import java.math.BigDecimal;
import java.util.Date;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creamos una instancia del evento musical
        EventoMusical concierto = new EventoMusical(
                "Wacken Open Air",
                new Date(),
                new BigDecimal("1500450.50")
        );

        // Imprimimos sus datos para comprobar el funcionamiento
        System.out.println("Evento creado con éxito:");
        System.out.println("Nombre: " + concierto.getNombre());
        System.out.println("Fecha: " + concierto.getFecha());
        System.out.println("Recaudación: " + concierto.getRecaudacion() + " €");
    }
}