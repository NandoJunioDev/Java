import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDao  {
 public void Cadastrar  (Aluno aluno) throws SQLException {
        String sql  = "INSERT INTO aluno (MATRICULA,NOME,DATA) VALUE (?,?,?)";
        PreparedStatement  preparedStatement = null;

     try {
         preparedStatement = ConexaoBD.getConnection().prepareStatement(sql);
         preparedStatement.setString(1, aluno.getMatricula());
         preparedStatement.setString(2, aluno.getNome());
         preparedStatement.setString(3, aluno.getData());
         preparedStatement.execute();
         preparedStatement.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }


 }
 public  void Deletar (Aluno aluno) {
     String sql = "DELETE FROM  aluno WHERE  MATRICULA = ? ";
     PreparedStatement preparedStatement = null;


     try {
         preparedStatement = ConexaoBD.getConnection().prepareStatement(sql);
         preparedStatement.setString(1, aluno.getMatricula());

         preparedStatement.execute();
         preparedStatement.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }


 }

 public static List<Aluno>  getAluno () throws SQLException {

     String sql = "SELECT * FROM  aluno";
     List<Aluno> alunos = new ArrayList<>();
     PreparedStatement preparedStatement = null;


     ResultSet resultSet = null;


     try {

         preparedStatement = ConexaoBD.getConnection().prepareStatement(sql);
         resultSet = preparedStatement.executeQuery();
         while (resultSet.next()) {
             Aluno aluno = new Aluno();
             aluno.setMatricula(resultSet.getString("MATRICULA"));
             aluno.setNome(resultSet.getString("NOME"));
             aluno.setData(resultSet.getString("Data"));

             alunos.add(aluno);


         }



     } catch (SQLException e) {
         throw new RuntimeException(e);
     } finally {
         if (resultSet != null) {
             resultSet.close();

         }
         if (preparedStatement != null) {
             preparedStatement.close();
         }


     }


     return alunos;




 }


 }


