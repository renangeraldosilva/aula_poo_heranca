package aula11b;
public class Aula011b {
    public static void main(String[] args) {

     Aluno aluno = new Aluno();
     aluno.setCurso("POO JAVA.");
     aluno.setMatricula(20545814);
     aluno.setNome("Joane");
     aluno.setIdade(17);
     aluno.setSexo("F");
     System.out.println(aluno.toString());
     aluno.pagarMensalidade();
     System.out.println(" ");

     Bolsista bolsista = new Bolsista();
     bolsista.setNome("Arnold");
     bolsista.setMatricula(1112);
     bolsista.setIdade(18);
     bolsista.setSexo("M");
     bolsista.setBolsa(12.f);
     System.out.println(bolsista.toString());
     bolsista.pagarMensalidade();
     System.out.println(" ");

     Professor professor = new Professor();
     professor.setNome("Ana");
     professor.setIdade(42);
     professor.setSexo("F");
     professor.setEspecialidade("Dra. Java");
     professor.setSalario(3570f);
     professor.receberAumento(500f);
     System.out.println(professor.toString());

     Tecnico tecnico = new Tecnico();
     tecnico.setNome("José");
     tecnico.setIdade(16);
     tecnico.setSexo("M");
     tecnico.setMatricula(20257);
     tecnico.setRegistroProfissional(1548);
     System.out.println(tecnico.toString());
    }

}
