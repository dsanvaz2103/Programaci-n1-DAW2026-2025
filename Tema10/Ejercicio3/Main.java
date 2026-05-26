package Tema10.Ejercicio3;

import Tema10.Ejercicio2.GeneroMusical;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        EventoMusical ev = new EventoMusical("Resurrection Fest", new Date(), new BigDecimal("2500000"), GeneroMusical.METAL);

        // Probamos la variable transient de control
        ev.setControl(1);

        System.out.println("Evento: " + ev.getNombre());
        System.out.println("Genero: " + ev.getGenero());
        System.out.println("Valor de control: " + ev.getControl());
        System.out.println("ID (lo generara la BD de 10 en 10): " + ev.getId());
    }
}
