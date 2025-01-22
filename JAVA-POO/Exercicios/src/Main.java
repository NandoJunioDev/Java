public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Pessoas p1 = new Pessoas("Fernando Junio",23,"Masculino");
        Livros l1 = new Livros("Seda","Desconhecido", 200);
        l1.setLeitor(p1);
        l1.abrir();


        l1.avancaPagina();
        l1.avancaPagina();
        l1.folhar();
        l1.Detalhes();



    }
}