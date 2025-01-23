public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public Professor(String especialidade, double salario) {
        super("algume","indefinido",0);
        setEspecialidade(especialidade);
        setSalario(salario);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}' + "Nome Do Professor:"  + getNome() + "Sexo:" + getSexo() +  "Idade Do Professor" +   getIdade()
                                            ;
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    private void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
