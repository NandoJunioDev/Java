import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rouds;
    private  boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if ( l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }else {
            setAprovada(false);
            setDesafiante(null);
            setDesafiado(null);
        }
    }


    public void lutar(){
        if ( getAprovada() == true ){
            desafiado.apresentar();
            desafiante.apresentar();
            vencedor = new  Random();
        }else {

         System.out.println("luta não pode acontecer");
        }





    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dd) {
        this.desafiante = dd;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
