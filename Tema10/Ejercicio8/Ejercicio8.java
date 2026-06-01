package Tema10.Ejercicios.Ejercicio8;

import java.sql.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio8 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            // Desactivar auto-commit para transacciones
            con.setAutoCommit(false);

            // --- PRIMER BATCH (Consultas del Ejercicio 10) ---
            stmt.addBatch("DELETE FROM producto");
            stmt.addBatch("INSERT INTO producto VALUES ('1', 'manzana', 'Manzanas golden', 50, 'Francia')");
            stmt.addBatch("INSERT INTO producto VALUES ('2', 'pera', 'Peras conferencia', 25, 'Espana')");
            stmt.addBatch("INSERT INTO producto VALUES ('3', 'uva', 'Uvas groumet', 30, 'Espana')");
            stmt.addBatch("UPDATE producto SET precio = 20 WHERE nombre = 'pera'");

            stmt.executeBatch(); // Ejecutar lote 1
            con.commit();        // Guardar cambios
            stmt.clearBatch();   // Limpiar lote para que no se repitan las queries


            // --- SEGUNDO BATCH (Nuevas inserciones) ---
            stmt.addBatch("INSERT INTO producto VALUES ('4', 'kiwi', 'Zaspri gold', 120, 'Nueva Zelanda')");
            stmt.addBatch("INSERT INTO producto VALUES ('5', 'perito', 'Peritos de Tavizna', 18, 'Espana')");
            stmt.addBatch("INSERT INTO producto VALUES ('6', 'platano', 'Platano canario', 40, 'Espana')");

            stmt.executeBatch(); // Ejecutar lote 2
            con.commit();        // Guardar cambios


            // --- USO DEL MÉTODO execute() ---
            String queryEspana = "SELECT * FROM producto WHERE pais = 'Espana'";

            // execute() devuelve true si es un SELECT
            boolean esSelect = stmt.execute(queryEspana);

            if (esSelect) {
                // Pillar los resultados del execute anterior
                ResultSet resultados = stmt.getResultSet();

                System.out.println("--- PRODUCTOS ESPAÑOLES ---");
                while (resultados.next()) {
                    String nombre = resultados.getString("nombre");
                    int precio = resultados.getInt("precio");
                    System.out.println("Producto: " + nombre + " | Precio: " + precio + " centimos.");
                }
                resultados.close();
            }

            // Cerrar todo
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("Error en la base de datos.");
            e.printStackTrace();
        }
    }
}