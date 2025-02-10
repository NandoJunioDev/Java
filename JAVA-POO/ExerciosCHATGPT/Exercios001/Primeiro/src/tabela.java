import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class tabela {



    public void  criarTabela () throws SQLException {
        try {
            Connection connection = ConexaoBD.conectar();
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS clientes ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "nome VARCHAR(100), "
                    + "email VARCHAR(100))";

            statement.executeUpdate(sql);
            System.out.println("tabela criada com suceeso");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }






}
