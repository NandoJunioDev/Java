import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello, World!");
        AlunoDao ad = new AlunoDao();

        Aluno a1 = new Aluno("445","birulaide","66/66/6666");
        Aluno a2 = new Aluno("222","dddd","22/22/22");

        new AlunoDao().getAluno();



        for(Aluno c : AlunoDao.getAluno()){
            System.out.println("Aluno:" + c.getNome() +  "   Matricula: " + c.getMatricula());
        }




    }


}