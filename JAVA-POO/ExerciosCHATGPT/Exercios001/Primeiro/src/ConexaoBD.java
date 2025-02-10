import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    // dados para se conectar ao banco de dados
    // logo me baixo, passando a url,user,password nessa sequecia;
    private static final  String url = "jdbc:mysql://root:oaXqiYFhZyfLMLbjekZGYIeQzCJBZLqE@roundhouse.proxy.rlwy.net:13549/railway";
    private static final String user  = "root";
    private static final String password = "oaXqiYFhZyfLMLbjekZGYIeQzCJBZLqE";

    //  nao podemos esquecer de colocar interface Connection, dessa forma

    public static Connection connection = null;


    // aqui faremos um funçao que conectara ao banco de dados, o variavel do tipo Connection
    // recebera o drivemanageer.getconnection (url,user,password)

    public static Connection conectar (){
        try{
            if ( connection == null )
                 connection = DriverManager.getConnection(url,user,password);



        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        return  connection;
    }



}

