package aula11b;
public class Tecnico extends Aluno{
    private int registroProfissional;

    public void praticar() {
        System.out.println("Aulas técnicas ");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
