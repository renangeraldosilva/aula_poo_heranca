package aula11b;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento(float valorAumento) {
        this.salario = this.salario + valorAumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+ '\n' +
                "especialidade: " + especialidade + '\n' +
                "salario: " + salario + '\n';
    }
}
