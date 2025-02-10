import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class  ClienteDao {


    Scanner entrada = new Scanner(System.in);
    Clientes clientes = new Clientes();
    private Clientes nome;


    public  void Cadastrar () throws SQLException {

        System.out.println("Digite Seu nome");
       clientes.setNome(entrada.nextLine());

        System.out.println("Digite Seu email");
        clientes.setEmail(entrada.nextLine());

        String sql = "INSERT INTO clientes (nome, email) VALUES (?, ?)";
        PreparedStatement preparedStatement = null;

    try {
        preparedStatement = ConexaoBD.conectar().prepareStatement(sql);
        preparedStatement.setString(1, clientes.getNome());
        preparedStatement.setString(2, clientes.getEmail());
        preparedStatement.execute();
        preparedStatement.close();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }


}

 public List<Clientes> VerCadastros() throws SQLException {
    List<Clientes> clientesList = new ArrayList<>();
    String sql = "SELECT * FROM  clientes";
    PreparedStatement preparedStatement = null;
     ResultSet resultado = null;

     try {
         preparedStatement = ConexaoBD.conectar().prepareStatement(sql);
         resultado = preparedStatement.executeQuery();
         while (resultado.next()){
             Clientes clientes = new Clientes();
             clientes.setId(resultado.getInt("id"));
             clientes.setNome(resultado.getString("nome"));
             clientes.setEmail(resultado.getString("email"));
            clientesList.add(clientes);



         }

     } catch (SQLException e) {
         throw new RuntimeException(e);
     } finally {

         for (Clientes c: clientesList){

             System.out.println(" Id  " + c.getId() +   " Nome:  " + c.getNome() + "   Email: " +  c.getEmail());

         }


         if ( resultado != null){
             resultado.close();
         }
         if (preparedStatement != null) {
             preparedStatement.close();
         }
     }

        return clientesList;
 }

 public void Deletar(String nome) throws SQLException{
        clientes.setNome(nome);
        

     String sql = "DELETE FROM clientes WHERE nome = ?";


    PreparedStatement preparedStatement = null;
    try {
        preparedStatement = ConexaoBD.conectar().prepareStatement(sql);
        preparedStatement.setString(1, clientes.getNome());

        preparedStatement.execute();
        preparedStatement.close();
    } catch (SQLException e) {}


 }


 public void atualizarCadastro( ) throws SQLException {

        System.out.println("digite o id Do cliente que quer atualizar o email e nome");
            int id = entrada.nextInt();
         entrada.nextLine();
         System.out.println("Digite o novo email");
         String email = entrada.nextLine();
         System.out.println("Digite o novo nome");
         String nome = entrada.nextLine();


        String sql = "UPDATE clientes SET email  = ? , nome = ? WHERE id = ?";
        PreparedStatement preparedStatement = null;

     try {
         preparedStatement = ConexaoBD.conectar().prepareStatement(sql);
         preparedStatement.setString(1, email);
         preparedStatement.setString(2, nome);
         preparedStatement.setInt(3, id);
         preparedStatement.execute();
         int linhasAfetadas = preparedStatement.executeUpdate();
         if (linhasAfetadas > 0) {
             System.out.println("Email atualizado com sucesso");
         }else {
             System.out.println("Nenhum cliente foi atualizado");
         }

     } catch (SQLException e) {
         throw new RuntimeException(e);
     } finally {
         entrada.close();
         preparedStatement.close();
     }


 }


}



