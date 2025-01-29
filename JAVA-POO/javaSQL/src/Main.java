public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Aluno a = new Aluno();
        a.setMatricula("123455");
        a.setNome("Fernando");
        a.setData("22/02/22");
        Aluno b = new Aluno();
        a.setMatricula("666");
        a.setNome("mamador");
        a.setData("12/06/11");

        new Usuariodao().cadastrar(a);
        new Usuariodao().cadastrar(b);
    }
}