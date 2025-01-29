import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class Usuariodao {


    public void cadastrar (Aluno aluno ){
        String sql = "INSERT INTO NEW_TABLE  (MATRICULA,NOME,ENTRADA) VALUE (?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = Objects.requireNonNull(Conexao.getConexao()).prepareStatement(sql);
            ps.setString(1, aluno.getMatricula());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getData());
            ps.execute();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
