package Tema10.Ejercicios.Ejercicio10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio10 {

    private static final String URL = "jdbc:mariadb://localhost:3306/tienda";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {

        String sqlDelete = "DELETE FROM producto";
        String sqlInsert = "INSERT INTO producto (id, nombre, descripcion, precio, pais) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexión establecida con éxito.");

            // 1. Borrar todos los registros de la tabla productos
            try (Statement stmt = conn.createStatement()) {
                int filasBorradas = stmt.executeUpdate(sqlDelete);
                System.out.println("Tabla vaciada. Registros eliminados: " + filasBorradas);
            }

            // 2. Insertar los 3 nuevos registros
            try (PreparedStatement pstmt = conn.prepareStatement(sqlInsert)) {

                // Registro 1
                pstmt.setInt(1, 1);
                pstmt.setString(2, "manzana");
                pstmt.setString(3, "Manzana real");
                pstmt.setDouble(4, 25.0);
                pstmt.setString(5, "Espana");
                pstmt.executeUpdate();

                // Registro 2
                pstmt.setInt(1, 2);
                pstmt.setString(2, "pera");
                pstmt.setString(3, "Pera limonera");
                pstmt.setDouble(4, 30.5);
                pstmt.setString(5, "Francia");
                pstmt.executeUpdate();

                // Registro 3
                pstmt.setInt(1, 3);
                pstmt.setString(2, "naranja");
                pstmt.setString(3, "Naranja de mesa");
                pstmt.setDouble(4, 15.0);
                pstmt.setString(5, "Portugal");
                pstmt.executeUpdate();

                System.out.println("Los 3 nuevos registros se han insertado correctamente.");
            }

        } catch (SQLException e) {
            System.err.println("Error de base de datos: " + e.getMessage());
        }
    }
}