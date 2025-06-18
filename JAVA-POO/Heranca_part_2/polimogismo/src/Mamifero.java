public class Mamifero extends Animal {


    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
    System.out.printf ("Correndo");

    }

    @Override
    public void alimentar() {
    System.out.printf ("Mamando");

    }

    @Override
    public void emitirSom() {

        System.out.printf ("Emitindo som de mamifero");


    }
}
