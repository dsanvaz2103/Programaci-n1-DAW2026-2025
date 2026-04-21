package Tema8.Ejercicio10;
import Tema8.Persona;

import java.util.Comparator;

public class ComparadoresPersona {
    // Comparador por Edad
    public static class CompararEdad implements Comparator<Persona> {
        @Override
        public int compare(Persona p1, Persona p2) {
            if (p1.getEdad() == p2.getEdad())
                return 0;
            if (p1.getEdad() > p2.getEdad())
                return 1;
            else
                return -1;
        }
    }
    }


