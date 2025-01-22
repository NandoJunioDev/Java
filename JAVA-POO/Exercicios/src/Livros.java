public class Livros implements IPublicacao {
 private String  titulo;
 private String autor;
 private int totalPagina;
 private boolean aberto;
 private Pessoas leitor;
 private int paginaAtual;

    public int getPaginaAtual() {
        return paginaAtual;
    }

    private void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public Livros () {
        setLeitor(leitor);
        setPaginaAtual(0);
    }
    public Livros(String titulo, String autor, int totalPagina) {
        setTitulo(titulo);
        setAutor(autor);
        setTotalPagina(totalPagina);

    }

    public  void Detalhes (){
     System.out.println( "Esse é  o autor do Livro: " + getAutor() );
     System.out.println("Esse é o titulo do Livro, que se chama: " + getTitulo());
     System.out.println("foi essa pessoa que leu: " + getLeitor().getNome());
     System.out.println("Ele Esta Aberto?:" + isAberto());
     System.out.println("o livro tem " + getTotalPagina() +  " paginas");

 }



    public int getTotalPagina() {
        return totalPagina;
    }

    private void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoas getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoas leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (isAberto() == false) {
            setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (isAberto() == true) {
            setAberto(false);
        }
    }

    @Override
    public void folhar() {
        if (isAberto() == true) {
            for ( int t = paginaAtual ; totalPagina >= t; t++  ){
                System.out.println("Passei a  pagina " + (t - 0 ));

                if (t == 200 ) {
                    System.out.println("passei por todo o livro, que livro foda ");
                }
            }
        } else {
            System.out.println("Primeiro é necessario abrir o livro para foliar");
        }

    }

    @Override
    public void avancaPagina() {

        if (isAberto() == true && getPaginaAtual() < getTotalPagina()) {
            setPaginaAtual(getPaginaAtual() + 1);
        } else{
            System.out.println("Abra primeiro o livro");

        }
        System.out.println("Paramos na pagina " + getPaginaAtual());
    }

    @Override
    public void voltar() {
        if (isAberto() == true && getPaginaAtual() > 0 ){
             setPaginaAtual(getPaginaAtual() - 1);
        }else{
            System.out.println("Abra primeiro o livro");
        }
    }
}
