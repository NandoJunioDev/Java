public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Animal gato = new Gato();
        Animal cachorro = new Cachorro();
        gato.FazerBarulho();
        cachorro.FazerBarulho();
        cachorro.Dormir();
        gato.Dormir();
    }
}