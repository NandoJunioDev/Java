public class Bolsista  extends Aluno{
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public  void renovarBolsa (){
        System.out.printf ("renobando");
    }
    @Override
    public  void pagarMensalidade(){
        System.out.printf (this.getNome ()+ "ele é bolsista");
    }

}
