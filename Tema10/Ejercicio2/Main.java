package Tema10.Ejercicio2;

import java.math.BigDecimal;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        // Crear el evento
        EventoMusical ev = new EventoMusical("Resurrection Fest", new Date(), new BigDecimal("2500000"), GeneroMusical.METAL);

        // Crear un par de artistas y meterlos
        Artista a1 = new Artista("Slipknot", "150000");
        Artista a2 = new Artista("Pantera", "120000");

        ev.añadirArtista(a1);
        ev.añadirArtista(a2);

        // Imprimir para comprobar
        System.out.println("Evento: " + ev.getNombre());
        System.out.println("Fecha: " + ev.getFecha());
        System.out.println("Pasta: " + ev.getRecaudacion());
        System.out.println("Genero: " + ev.getGenero());
        System.out.println("ID en BD: " + ev.getId()); // Saldra null

        System.out.println("Artistas:");
        for (Artista a : ev.getArtistasConfirmados()) {
            System.out.println("- " + a.getNombreArtistico() + ": " + a.getCache());
        }
    }
}
