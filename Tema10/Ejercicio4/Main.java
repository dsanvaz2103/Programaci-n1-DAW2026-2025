package Tema10.Ejercicio4;

import Tema10.Ejercicio2.GeneroMusical;
import Tema10.Ejercicio3.EventoMusical;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {


        EventoMusical ev = new EventoMusical("Resurrection Fest", new Date(2026,7,21), new BigDecimal("2500000"), GeneroMusical.METAL);
        EventoMusical ev2 = new EventoMusical("Resurrection Fest", new Date(2026,7,21), new BigDecimal("2500000"), GeneroMusical.METAL);

        // Probamos la variable transient de control
        ev.setControl(1);

        System.out.println("Evento: " + ev.getNombre());
        System.out.println("Genero: " + ev.getGenero());
        System.out.println("Valor de control: " + ev.getControl());
        System.out.println("ID (lo generara la BD de 10 en 10): " + ev.getId());

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
