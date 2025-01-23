import java.util.Random;

public class Aluno extends Pessoa{

    private Random matricula;
    private String curso;

    public Aluno(Random matricula, String curso) {
        super("Aluno1","indefinido",0);
        setCurso(curso);
        setMatricula(matricula);
        matricula = new Random();
        int m =   matricula.nextInt(100);

    }

    public Random getMatricula() {
        return matricula;
    }

    private void setMatricula(Random matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    private void setCurso(String curso) {
        this.curso = curso;
    }
}
