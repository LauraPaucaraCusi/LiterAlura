import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablas {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:src/resources/literatura.db";

        String sql = "CREATE TABLE IF NOT EXISTS libros (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "titulo TEXT NOT NULL," +
                "autor TEXT NOT NULL," +
                "anio INTEGER" +
                ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
            System.out.println("¡Tabla 'libros' creada correctamente!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
