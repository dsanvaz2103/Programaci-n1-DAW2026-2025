package Tema5.Ejercicio12;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista de animales (Polimorfismo)
        Animal[] animales = {
                new Perro("Rex", 5),
                new Gato("Luna", 3),
                new Pajaro("Pipo", 1)
        };

        for (Animal a : animales) {
            a.mostrarInformacion();
            a.hacerSonido();
            System.out.println("Movimiento: " + a.moverse());
            System.out.println("-----------------------------");
        }

        // Nota: No podrías hacer -> Animal a = new Animal("Generico", 0);
        // Porque la clase Animal es abstracta.
    }
}
