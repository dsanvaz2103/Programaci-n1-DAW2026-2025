package Tema11.Ejercicio6;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio6 extends Frame implements ActionListener {

    private Button btnRestar, btnSumar;
    private Label lblContador;
    private int contador = 0;

    public Ejercicio6() {
        setTitle("Contador Eficiente");
        setSize(300, 150);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 40));

        btnRestar = new Button("-1");
        lblContador = new Label("0");
        btnSumar = new Button("+1");

        btnRestar.addActionListener(this);
        btnSumar.addActionListener(this);

        add(btnRestar);
        add(lblContador);
        add(btnSumar);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRestar) {
            contador--;
        } else if (e.getSource() == btnSumar) {
            contador++;
        }

        lblContador.setText(String.valueOf(contador));
    }

    public static void main(String[] args) {
        new Ejercicio6();
    }
}