public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Pessoas [] pessoas = new Pessoas[1000];
        Livros [] livros = new Livros[1000];
        pessoas[0] =  new Pessoas(
                "ana julia",22,"Binarie");
        pessoas [1] = new Pessoas("bela", 22 ,"lgbt");

        livros[0] = new Livros(
                "barbie","disney",100);


        livros[0].setLeitor(pessoas[1]);
        livros[0].Detalhes();

    }
}