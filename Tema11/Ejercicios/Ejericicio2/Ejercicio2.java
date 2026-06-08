package Tema11.Ejercicios.Ejericicio2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio2 extends Frame {

    public Ejercicio2() {
        setTitle("Posicionamiento Absoluto");
        setSize(400, 300);

        // Indicamos que usaremos posicionamiento absoluto (Layout nulo)
        setLayout(null);

        // Crear los componentes
        Label etiqueta = new Label("Etiqueta personalizada");
        Button boton = new Button("Botón");

        // Definir posición y tamaño exactos en píxeles: setBounds(x, y, ancho, alto)
        etiqueta.setBounds(50, 80, 150, 30);
        boton.setBounds(50, 130, 100, 40);

        // Añadir los componentes a la ventana
        add(etiqueta);
        add(boton);

        setVisible(true);

        // Control para cerrar la ventana con la X
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Ejercicio2();
    }
}