package Tema11.Ejercicios.Ejercicio5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio5 extends Frame implements ActionListener {

    private Label lblTexto;
    private MenuItem itemNegrita, itemNormal;
    private MenuItem itemRojo, itemAzul, itemNegro;

    public Ejercicio5() {
        setTitle("Procesador de Textos - Menús");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 100));

        // 1. Crear la etiqueta central
        lblTexto = new Label("Texto de prueba");
        lblTexto.setFont(new Font("Arial", Font.PLAIN, 18));
        add(lblTexto);

        // 2. Crear la barra de menú y las pestañas principales
        MenuBar barraMenu = new MenuBar();
        Menu menuEstilo = new Menu("Estilo");
        Menu menuColor = new Menu("Color");

        // 3. Crear los elementos del menú Estilo y registrarlos en el oyente
        itemNegrita = new MenuItem("Negrita");
        itemNormal = new MenuItem("Normal");
        itemNegrita.addActionListener(this);
        itemNormal.addActionListener(this);
        menuEstilo.add(itemNegrita);
        menuEstilo.add(itemNormal);

        // 4. Crear los elementos del menú Color y registrarlos en el oyente
        itemRojo = new MenuItem("Rojo");
        itemAzul = new MenuItem("Azul");
        itemNegro = new MenuItem("Negro");
        itemRojo.addActionListener(this);
        itemAzul.addActionListener(this);
        itemNegro.addActionListener(this);
        menuColor.add(itemRojo);
        menuColor.add(itemAzul);
        menuColor.add(itemNegro);

        // 5. Ensamblar los menús en la barra y asignarla a la ventana
        barraMenu.add(menuEstilo);
        barraMenu.add(menuColor);
        setMenuBar(barraMenu);

        setVisible(true);

        // Control para cerrar la ventana con la X
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Gestión de los eventos al pulsar las opciones del menú
    @Override
    public void actionPerformed(ActionEvent e) {
        Object origen = e.getSource();

        // Control de Estilos
        if (origen == itemNegrita) {
            lblTexto.setFont(new Font("Arial", Font.BOLD, 18));
        } else if (origen == itemNormal) {
            lblTexto.setFont(new Font("Arial", Font.PLAIN, 18));
        }
        // Control de Colores
        else if (origen == itemRojo) {
            lblTexto.setForeground(Color.RED);
        } else if (origen == itemAzul) {
            lblTexto.setForeground(Color.BLUE);
        } else if (origen == itemNegro) {
            lblTexto.setForeground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        new Ejercicio5();
    }
}