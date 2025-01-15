public class Cachorro implements Icachorro {
    private int quantidade_De_Patas;
    private String nome;
    private int tempo_De_Vida;
    private String raça;

    public Cachorro(String raça, String nome) {
        this.setRaça(raça);
        this.setNome(nome);
    }

    public int getTempo_De_Vida() {
        return tempo_De_Vida;
    }

    public void setTempo_De_Vida(int tempo_De_Vida) {
        this.tempo_De_Vida = tempo_De_Vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade_De_Patas() {
        return quantidade_De_Patas;
    }

    public void setQuantidade_De_Patas(int quantidade_De_Patas) {
        this.quantidade_De_Patas = quantidade_De_Patas;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;



    }
    public   void  Latir(){
        System.out.println("auau");
    }
    public   void Correr(){
        System.out.println("Se movendo a setendo km horas");

    }
}
