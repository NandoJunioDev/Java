public class Funcionario extends  Pessoa {
    private  String setor;
    private String trabalho;

    public Funcionario(String setor, String trabalho) {
        super("Alguem","indefinido", 0);
        setSetor(setor);
        setTrabalho(trabalho);
    }

    public String getSetor() {
        return setor;
    }

    private void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTrabalho() {
        return trabalho;
    }

    private  void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }
    public void mudarTrabalho( String trabalhoNovo){
        setTrabalho(trabalhoNovo);
        System.out.println("Você Mudou de trabalho");
    }
}
