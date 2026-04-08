package Tema7.Ejercicio5;

// Paso 1: Heredar de IllegalArgumentException
public class NumeroRepetido extends IllegalArgumentException {

    // Paso 2: Constructor que reutiliza el código del padre (super)
    public NumeroRepetido(String mensaje) {
        super(mensaje);
    }
}
