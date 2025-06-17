public class Professor extends  Pessoa {

    private String especialidade;
    private  double salario;



    public void receberAumento(){
        salario = 10/salario * 100;
    }
}
