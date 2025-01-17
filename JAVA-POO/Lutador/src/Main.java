public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador(
               "pretty boy","brasil",44,
                1.75,76.2,
                11,2,3
        );

        lutador[1] = new Lutador(
                "putiscript","Brasil", 29,
                1.68,37.8,14,2,3
        );

        lutador[2] = new Lutador(
                "Snapshadow","EUA",35,
                1.65,80.9,
                12,2,1
        );
        lutador[3] = new Lutador(
                "Deadcoda","Australia",28,
                1.93,81.6,
                13,0,2
        );
        lutador[4] = new Lutador(
                "Ufocobol","Ingraterra",39,
                1.70,119.3,
                5,4,3
        );
        lutador[5] = new Lutador(
          "Nerddard", "EUA", 30,
          1.81,105.7,
          12,2,4
        );
        lutador[5].apresentar();

        Luta  Ufc1 = new Luta();
            Ufc1.marcarLuta(lutador[2],lutador[1]);
            Ufc1.lutar();
            lutador[2].status();
            lutador[1].status();
    }




    Luta  Ufc1 = new Luta();

}