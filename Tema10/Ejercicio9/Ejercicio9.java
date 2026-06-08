package Tema10.Ejercicios.Ejercicio9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio9 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root";
        String password = "";

        String query = "SELECT * FROM producto ORDER BY precio DESC";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet resultados = stmt.executeQuery(query);

            System.out.println("Productos ordenados por precio (de mayor a menor):");

            while (resultados.next()) {
                String id = resultados.getString("id");
                String nombre = resultados.getString("nombre");
                int precio = resultados.getInt("precio");
                String pais = resultados.getString("pais");

                System.out.println("Producto: " + nombre + " | Precio: " + precio + "€ | Origen: " + pais + " (ID: " + id + ")");
            }

            resultados.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("No se pudo conectar");
            e.printStackTrace();
        }
    }
}
