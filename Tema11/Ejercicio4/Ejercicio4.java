package Tema11.Ejercicio4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio4 extends Frame {

    public Ejercicio4() {
        setTitle("Panel Ascensor");
        setSize(300, 400);

        // Rejilla de 2 filas y 2 columnas
        setLayout(new GridLayout(2, 2));

        // Añadir botones de los pisos
        add(new Button("Piso 1"));
        add(new Button("Piso 2"));
        add(new Button("Piso 3"));
        add(new Button("Piso 4"));

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Ejercicio4();
    }
}