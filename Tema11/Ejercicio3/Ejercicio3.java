package Tema11.Ejercicios.Ejercicio3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio3 extends Frame {

    public Ejercicio3() {
        setTitle("Demostración de Layouts");
        setSize(800, 400);
        setLayout(new GridLayout(1, 3));

        // Panel 1: FlowLayout
        Panel panelFlow = new Panel(new FlowLayout());
        panelFlow.add(new Button("Flow 1"));
        panelFlow.add(new Button("Flow 2"));
        panelFlow.add(new Button("Flow 3"));

        // Panel 2: BorderLayout
        Panel panelBorder = new Panel(new BorderLayout());
        panelBorder.add(new Button("Norte"), BorderLayout.NORTH);
        panelBorder.add(new Button("Sur"), BorderLayout.SOUTH);
        panelBorder.add(new Button("Este"), BorderLayout.EAST);
        panelBorder.add(new Button("Oeste"), BorderLayout.WEST);
        panelBorder.add(new Button("Centro"), BorderLayout.CENTER);

        // Panel 3: GridLayout
        Panel panelGrid = new Panel(new GridLayout(2, 2));
        panelGrid.add(new Button("Grid A"));
        panelGrid.add(new Button("Grid B"));
        panelGrid.add(new Button("Grid C"));
        panelGrid.add(new Button("Grid D"));

        // Añadir paneles al frame principal
        add(panelFlow);
        add(panelBorder);
        add(panelGrid);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Ejercicio3();
    }
}