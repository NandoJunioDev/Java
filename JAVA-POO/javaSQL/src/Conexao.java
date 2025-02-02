import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

        private static final  String url = "jdbc:mysql://root:oaXqiYFhZyfLMLbjekZGYIeQzCJBZLqE@roundhouse.proxy.rlwy.net:13549/railway";
        private  static  final  String user = "root";
        private static  final String senha = "oaXqiYFhZyfLMLbjekZGYIeQzCJBZLqE"; // dUFCpCBDkJYwdPzLwxHhTJfAUPAuSRZT

        private static Connection conn;


        public static Connection getConexao() {
        }
}
