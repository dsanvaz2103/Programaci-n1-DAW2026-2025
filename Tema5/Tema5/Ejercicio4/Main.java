package Tema5.Ejercicio4;


public class Main {
        public static void main(String[] args) {
            // Llamada inicial (debería ser 0)
            ContadorObjeto.mostrarTotalObjetos();

            // Creamos tres instancias
            ContadorObjeto obj1 = new ContadorObjeto();
            ContadorObjeto obj2 = new ContadorObjeto();
            ContadorObjeto obj3 = new ContadorObjeto();

            // Mostramos el total actualizado
            ContadorObjeto.mostrarTotalObjetos();
        }
}
