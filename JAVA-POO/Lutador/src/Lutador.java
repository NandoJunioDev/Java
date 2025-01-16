public class Lutador {

    //ATRIBUTOS

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura,peso;
    private String categoria;
    private  int vitoria;
    private  int derrota;
    private int empate ;
 // COSNTRUTOR

    public Lutador(String nome, String nacionalidade, int idade, double altura,
                    double peso,
                     int vitoria, int derrota, int empate) {



        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }


    //METODOS


    public void  apresentar(){
        System.out.println("Lutador:" + getNome());
        System.out.println("Nacionalidade:" + getNacionalidade());
        System.out.println("Idade:" + getIdade());
        System.out.println("Altura:" + getAltura());
        System.out.println( "peso:"  + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria()) ;
        System.out.println("vitorias:" + getVitoria());
        System.out.println("Derrotas:" + getDerrota());
        System.out.println("Empate:" + getEmpate());


    }
    public void status( ){
        System.out.println("Lutador:" + getNome());
        System.out.println("Nacionalidade:" + getNacionalidade());
        System.out.println("Idade:" + getIdade());
        System.out.println("Altura:" + getAltura());
    }
    public void ganharLuta(){
        setVitoria(getVitoria() + 1);
    }
    public void perderLuta(){
    setDerrota(getDerrota() + 1);
    }
    public void empatar(){
        setEmpate(getEmpate() + 1);
    }

    public String getCategoria() {
        return categoria;
    }

    private  void setCategoria() {
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
        this.setCategoria();
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

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
}
