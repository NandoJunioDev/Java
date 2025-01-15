public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura,peso;
    private String categoria;

    public Lutador(String nome, int idade, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if ( peso < 52.6){

            categoria = "Invalido";
            
        } else if (peso <= 65.2) {
            categoria = "Peso leve";

        } else if (peso <= 75.1) {
            categoria = "peso medio";


        } else if (peso <= 86.5) {
            categoria = "peso pesado";

        } else {
            categoria = "invalido";
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
