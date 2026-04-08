package Tema8;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    static void main() {
        /// 1. Crear una lista sin ninguna referencia (nula)
        List<Persona> lista = null;
        System.out.println("1. Lista inicial: " + lista);

        // 2. Asignarle una nueva lista vacía (instancia de ArrayList)
        lista = new ArrayList<>();
        System.out.println("2. Lista tras inicializar: " + lista);

        // 3. Añadir 3 personas
        lista.add(new Persona("Ana"));
        lista.add(new Persona("Bruno"));
        lista.add(new Persona("Carla"));
        System.out.println("3. Lista con 3 personas: " + lista);

        // 4. Obtener la última persona e imprimirla
        // El índice es tamaño - 1
        Persona ultima = lista.get(lista.size() - 1);
        System.out.println("4. Última persona: " + ultima);

        // 5. Modificar el nombre de la primera persona
        lista.get(0).setNombre("Alicia");
        System.out.println("5. Lista tras modificar la primera: " + lista);

        // 6. Eliminar la persona en la posición central


        // 7. Recorrer con un for clásico
        System.out.println("7. Recorrido con for clásico:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("   Índice " + i + ": " + lista.get(i).getNombre());
        }

        // 8. Crear nueva persona, añadirla y confirmar si existe
        Persona nuevaPersona = new Persona("Diego");
        lista.add(nuevaPersona);
        System.out.println("8. Lista tras añadir a Diego: " + lista);
        boolean contiene = lista.contains(nuevaPersona);
        System.out.println("   ¿La lista contiene a la persona recién creada?: " + contiene);

        // 9. Vaciar la lista y confirmar
        lista.clear();
        System.out.println("9. Lista tras clear(): " + lista);
        System.out.println("   ¿Está vacía?: " + lista.isEmpty());

    }
}
