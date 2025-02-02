import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String url = "jdbc:mysql://root:oaXqiYFhZyfLMLbjekZGYIeQzCJBZLqE" +
            "@roundhouse.proxy.rlwy.net:13549" +
            "/railway";
    private static final String user = "root";
    private static  final String senha = "oaXqiYFhZyfLMLbjekZGYIeQzCJBZLqE";

   private static   Connection conn;

    public static Connection getConnection () throws SQLException {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, senha);
                return conn;
            }
        } catch (SQLException e) {
            throw e;

        }
        return conn;
    }
}
