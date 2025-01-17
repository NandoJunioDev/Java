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
        if ( this.aprovada ){
            System.out.println("###### Desafiado ########");
            this.desafiado.apresentar();
            System.out.println("##### Desafiante ##########");
            this.desafiante.apresentar();
            Random aletorio = new Random();
            int vencedor = aletorio.nextInt(3);
            switch (vencedor) {
                case 0: // Empate
                    this.desafiado.empatar();
                    this.desafiante.empatar();

                    break;
                case 1: // vence
                    System.out.println("Deafiante ganhou" + this.desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                case 2: // perde
                    System.out.println("Desafiado ganhou" + this.desafiado.getNome());
                    desafiante.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
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
