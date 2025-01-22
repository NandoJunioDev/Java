public class Pessoas {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoas (String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public void Status (){
        System.out.println("Idade atual: " + getIdade());
        System.out.println("nome: "  + getNome());
        System.out.println("Sexualidade: "  + getSexo());

    }

    public void fazerAniverssario () {
        setIdade(getIdade() + 1);
        System.out.println("Minha idade é:  " + getIdade());
    }

    public String getNome() {

        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        System.out.println("Minha idade atual é: "  + idade);
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        System.out.println("Sexo Atual:"  +    sexo);
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
