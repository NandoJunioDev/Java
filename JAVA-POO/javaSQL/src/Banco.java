import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Banco {
    public static void main(String[] arg) throws SQLException {
        Connection conexao
         = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/teste", "root", "1234");
        try {
            Class.forName("com.mysql.jdbc.Driver");

            ResultSet rscliente  =conexao.createStatement().executeQuery("SELECT * FROM NOME");
            while (rscliente.next()){
                System.out.println("Nome:" + rscliente.getString("nome"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver do banco de dados Errado");

        } catch (SQLException e) {
            throw new RuntimeException(e) ;



        }
        finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}
