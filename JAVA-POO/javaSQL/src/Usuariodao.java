import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class Usuariodao {



    public void cadastrar (@org.jetbrains.annotations.NotNull Aluno aluno ){
        String sql = "INSERT INTO aluno  (MATRICULA,NOME,DATA) VALUE (?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
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
