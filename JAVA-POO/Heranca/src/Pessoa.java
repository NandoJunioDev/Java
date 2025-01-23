public class Pessoa {
    private  String nome;
    private String sexo;
    private int idade;

    public Pessoa(String nome, String sexo, int idade) {
        setSexo(sexo);
        setIdade(idade);
        setNome(nome);

    }
    public void fazerAniverssario (){
        setIdade(getIdade() + 1);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    private  void setIdade(int idade) {
        this.idade = idade;
    }
}
