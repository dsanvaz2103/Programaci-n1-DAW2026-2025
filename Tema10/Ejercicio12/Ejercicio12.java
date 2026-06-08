package Tema10.Ejercicios.Ejercicio12;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio12 {

    private static final String URL = "jdbc:mariadb://localhost:3306/tienda";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            DatabaseMetaData metaData = conn.getMetaData();

            // 1. Nombre del usuario, URL y datos del SGBD/Driver
            System.out.println("--- Información de la Conexión y el SGBD ---");
            System.out.println("Nombre de usuario: " + metaData.getUserName());
            System.out.println("URL de conexión: " + metaData.getURL());
            System.out.println("Nombre del SGBD: " + metaData.getDatabaseProductName());
            System.out.println("Versión del SGBD: " + metaData.getDatabaseProductVersion());
            System.out.println("Nombre del driver: " + metaData.getDriverName());
            System.out.println("Versión del driver: " + metaData.getDriverVersion());
            System.out.println();

            // 2. Tablas de la base de datos tienda
            System.out.println("--- Tablas de la base de datos 'tienda' ---");
            try (ResultSet rsTablas = metaData.getTables("tienda", null, "%", new String[]{"TABLE"})) {
                while (rsTablas.next()) {
                    String nombreTabla = rsTablas.getString("TABLE_NAME");
                    System.out.println("- Tabla: " + nombreTabla);
                }
            }
            System.out.println();

            // 3. Columnas de la tabla producto
            System.out.println("--- Columnas de la tabla 'producto' ---");
            try (ResultSet rsColumnas = metaData.getColumns("tienda", null, "producto", "%")) {
                while (rsColumnas.next()) {
                    String nombreColumna = rsColumnas.getString("COLUMN_NAME");
                    String tipoColumna = rsColumnas.getString("TYPE_NAME");
                    int tamanoColumna = rsColumnas.getInt("COLUMN_SIZE");

                    System.out.printf("- %s (%s, tamaño: %d)%n", nombreColumna, tipoColumna, tamanoColumna);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error de base de datos al recuperar metadatos: " + e.getMessage());
        }
    }
}