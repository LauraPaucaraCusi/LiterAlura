import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:src/resources/literatura.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conexión a SQLite establecida!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
