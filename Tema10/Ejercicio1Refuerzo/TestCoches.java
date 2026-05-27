package Tema10.Ejercicio1Refuerzo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestCoches {
    public static void main(String[] args) {
        Coche c1 = new Coche();
        Coche c2 = new Coche();

        c1.setNombre("Ford");
        c2.setNombre("Lexus");
        c1.setColor("Azul");
        c2.setColor("Rojo");

        System.out.println("Nombre: " + c1.getNombre());
        System.out.println("Genero: " + c1.getColor());
        
        System.out.println("Nombre: " + c2.getNombre());
        System.out.println("Color: " + c2.getColor());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/coches.odb");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(c1);
        em.persist(c2);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
