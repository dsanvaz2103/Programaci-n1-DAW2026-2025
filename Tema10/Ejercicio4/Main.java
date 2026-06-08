package Tema10.Ejercicios.Ejercicio4;


import Tema10.Ejercicios.Ejercicio2.GeneroMusical;
import Tema10.Ejercicios.Ejercicio3.EventoMusical;
import Tema10.Ejercicios.PruebaConexionCoche.Coche;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        EventoMusical ev = new EventoMusical("Resurrection Fest", new Date(2026,7,12), new BigDecimal("2500000"), GeneroMusical.METAL);
        EventoMusical ev2 = new EventoMusical("Resurrection Fest", new Date(2026,4,24), new BigDecimal("3000000"), GeneroMusical.ROCK);
        // Probamos la variable transient de control
        ev.setControl(1);
        ev2.setControl(2);

        System.out.println("Evento: " + ev.getNombre());
        System.out.println("Genero: " + ev.getGenero());
        System.out.println("Valor de control: " + ev.getControl());
        System.out.println("ID (lo generara la BD de 10 en 10): " + ev.getId());

        System.out.println("Evento: " + ev2.getNombre());
        System.out.println("Genero: " + ev2.getGenero());
        System.out.println("Valor de control: " + ev2.getControl());
        System.out.println("ID (lo generara la BD de 10 en 10): " + ev2.getId());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventomusical.odb");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(ev);
        em.persist(ev2);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
