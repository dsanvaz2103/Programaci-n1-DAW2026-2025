package Tema10.Ejercicios.Ejercicio11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio11 {

    private static final String URL = "jdbc:mariadb://localhost:3306/tienda";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexión establecida con éxito.\n");

            // 1. Uso del método execute() para productos españoles
            System.out.println("--- 1. Productos españoles ---");
            String sqlEsp = "SELECT id, nombre, descripcion, precio, pais FROM producto WHERE pais = 'Espana'";

            try (Statement stmt = conn.createStatement()) {
                boolean tieneResultSet = stmt.execute(sqlEsp);

                if (tieneResultSet) {
                    try (ResultSet rs = stmt.getResultSet()) {
                        while (rs.next()) {
                            System.out.printf("ID: %d | %s | %s | %.2f€ | %s%n",
                                    rs.getInt("id"),
                                    rs.getString("nombre"),
                                    rs.getString("descripcion"),
                                    rs.getDouble("precio"),
                                    rs.getString("pais"));
                        }
                    }
                }
            }
            System.out.println();

            // 2. Ejecución en lote (Batch) de las consultas anteriores
            System.out.println("--- 2. Ejecutando lote de consultas anteriores ---");
            try (Statement stmtBatch = conn.createStatement()) {
                conn.setAutoCommit(false);

                stmtBatch.addBatch("UPDATE producto SET precio = precio * 1.05 WHERE pais = 'Espana'");
                stmtBatch.addBatch("UPDATE producto SET descripcion = CONCAT(descripcion, ' (Modificado)') WHERE precio > 50");

                int[] resultados = stmtBatch.executeBatch();
                conn.commit();
                System.out.println("Sentencias del lote procesadas: " + resultados.length);
            } catch (SQLException e) {
                conn.rollback();
                throw e;
            }
            System.out.println();

            // Limpieza previa automática para evitar el error 'Duplicate entry'
            try (Statement stmtClean = conn.createStatement()) {
                stmtClean.executeUpdate("DELETE FROM producto WHERE id IN (4, 5, 6)");
            }

            // 3. Inserción de nuevos productos mediante un nuevo Batch
            System.out.println("--- 3. Insertando nuevos productos en lote ---");
            String sqlInsert = "INSERT INTO producto (id, nombre, descripcion, precio, pais) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = conn.prepareStatement(sqlInsert)) {
                conn.setAutoCommit(false);

                // Fila 4
                pstmt.setInt(1, 4);
                pstmt.setString(2, "kiwi");
                pstmt.setString(3, "Zaspri gold");
                pstmt.setDouble(4, 120.0);
                pstmt.setString(5, "Nueva Zelanda");
                pstmt.addBatch();

                // Fila 5
                pstmt.setInt(1, 5);
                pstmt.setString(2, "perito");
                pstmt.setString(3, "Peritos de Tavizna");
                pstmt.setDouble(4, 18.0);
                pstmt.setString(5, "Espana");
                pstmt.addBatch();

                // Fila 6
                pstmt.setInt(1, 6);
                pstmt.setString(2, "plátano");
                pstmt.setString(3, "Plátano canario");
                pstmt.setDouble(4, 40.0);
                pstmt.setString(5, "Espana");
                pstmt.addBatch();

                int[] inserciones = pstmt.executeBatch();
                conn.commit();
                System.out.println("Registros añadidos correctamente: " + inserciones.length);

            } catch (SQLException e) {
                conn.rollback();
                System.err.println("Error en lote de inserción: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.err.println("Error de base de datos: " + e.getMessage());
        }
    }
}