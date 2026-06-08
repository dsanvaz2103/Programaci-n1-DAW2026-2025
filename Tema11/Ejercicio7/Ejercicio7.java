package Tema11.Ejercicio7;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio7 extends Frame implements ActionListener {

    private TextField txtUsuario, txtContrasena;
    private Button btnAceptar, btnLimpiar, btnExaminar;
    private Label lblFichero;

    public Ejercicio7() {
        setTitle("Pantalla de Login");
        setSize(350, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));

        // Campos de texto para Usuario y Contraseña
        add(new Label("Usuario:"));
        txtUsuario = new TextField(25);
        add(txtUsuario);

        add(new Label("Contraseña:"));
        txtContrasena = new TextField(25);
        txtContrasena.setEchoChar('*'); // Ocultar el texto de la contraseña
        add(txtContrasena);

        // Botones de acción del formulario
        btnAceptar = new Button("Aceptar");
        btnLimpiar = new Button("Limpiar");
        btnAceptar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        add(btnAceptar);
        add(btnLimpiar);

        // Separador visual básico usando un Panel vacío
        Panel separador = new Panel();
        separador.setSize(300, 2);
        add(separador);

        // Apartado Opcional: Selección de fichero
        add(new Label("Selección de fichero opcional:"));
        btnExaminar = new Button("Examinar...");
        btnExaminar.addActionListener(this);
        add(btnExaminar);

        lblFichero = new Label("Ningún fichero seleccionado");
        lblFichero.setForeground(Color.GRAY);
        add(lblFichero);

        setVisible(true);

        // Control para cerrar la ventana principal con la X
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object origen = e.getSource();

        if (origen == btnAceptar) {
            String usuario = txtUsuario.getText();
            mostrarDialogoBienvenida(usuario);

        } else if (origen == btnLimpiar) {
            txtUsuario.setText("");
            txtContrasena.setText("");
            lblFichero.setText("Ningún fichero seleccionado");
            lblFichero.setForeground(Color.GRAY);

        } else if (origen == btnExaminar) {
            FileDialog selector = new FileDialog(this, "Selecciona un fichero", FileDialog.LOAD);
            selector.setVisible(true);

            String archivo = selector.getFile();
            String directorio = selector.getDirectory();

            if (archivo != null) {
                lblFichero.setText(directorio + archivo);
                lblFichero.setForeground(Color.BLACK);
            }
        }
    }

    // Metodo auxiliar para generar el diálogo modal nativo de AWT
    private void mostrarDialogoBienvenida(String usuario) {
        Dialog dialogo = new Dialog(this, "Bienvenido", true);
        dialogo.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        dialogo.setSize(250, 120);
        dialogo.setLocationRelativeTo(this); // Centrar respecto a la ventana principal

        Label lblMensaje = new Label("¡Bienvenido, " + usuario + "!");
        Button btnCerrarDialogo = new Button("Cerrar");

        btnCerrarDialogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogo.dispose();
            }
        });

        dialogo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dialogo.dispose();
            }
        });

        dialogo.add(lblMensaje);
        dialogo.add(btnCerrarDialogo);
        dialogo.setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio7();
    }
}
