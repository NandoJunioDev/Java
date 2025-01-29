import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

        private static final  String url = "jdbc:mysql://localhost:3306/teste";
        private  static  final  String user = "root";
        private static  final String senha = "1234";

        private static Connection conn;

        public static  Connection getConexao(){
               try {
                     if (conn == null){
                             conn = DriverManager.getConnection(url,user,senha);
                             return  conn;
                     }else {
                             return conn;
                     }
               }catch (SQLException e ){
                        e.printStackTrace();
                        return null;
               }

        }




}
