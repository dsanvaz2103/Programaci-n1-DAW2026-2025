package Tema8.Ejercicio10;
import Tema8.Persona;

import java.util.Comparator;

public class ComparadoresPersona  {
    // Comparador por Edad
    public static class CompararEdad implements Comparator<Persona> {
        @Override
        public int compare(Persona p1, Persona p2) {
            return Integer.compare(p1.getEdad(), p2.getEdad());
        }
    }

    // Comparador por Apellidos
    public static class CompararApellidos implements Comparator<Persona>{
        @Override
        public int compare(Persona p1, Persona p2) {
            return p1.getApellidos().compareToIgnoreCase(p2.getApellidos());
        }
    }

    // Comparador Combinado: Apellido -> Nombre -> Edad (Con gestión de nulos)
    public static class CompararTodo implements Comparator<Persona>{
        @Override
        public int compare(Persona p1, Persona p2) {
            String ap1 = p1.getApellidos();
            String ap2 = p2.getApellidos();

            // Ampliación: Apellidos null al principio
            if (ap1 == null && ap2 != null) return -1;
            if (ap1 != null && ap2 == null) return 1;

            int res = 0;
            if (ap1 != null && ap2 != null) {
                res = ap1.compareToIgnoreCase(ap2);
            }

            // Si los apellidos son iguales (o ambos null), comparamos por nombre
            if (res == 0) {
                res = p1.getNombre().compareToIgnoreCase(p2.getNombre());
            }

            // Si el nombre también es igual, desempatamos por edad
            if (res == 0) {
                res = Integer.compare(p1.getEdad(), p2.getEdad());
            }

            return res;
        }
    }
}
