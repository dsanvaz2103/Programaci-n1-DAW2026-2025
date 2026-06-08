package Tema11.Ejercicio1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio1 extends Frame {

    public Ejercicio1() {
        setTitle("Ejemplo AWT");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Button btnSalir = new Button("Salir");
        Button btnLimpiar = new Button("Limpiar");
        TextField txtEntrada = new TextField("Escribe algo...", 20);

        add(btnSalir);
        add(btnLimpiar);
        add(txtEntrada);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Ejercicio1();
    }
}