public class Aluno {

    public  String matricula;
    public String nome;
    public String data;

    public Aluno(String matricula, String nome, String data) {
        this.matricula = matricula;
        this.nome = nome;
        this.data = data;
    }
    public Aluno(){

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}


