package exemplos.unidade03.associacao;

public class Escola {

    public static void main(String[] args) {
        Turma turmaPOO = new Turma("POO");
        Aluno aluno = new Aluno("André", 123);
        turmaPOO.addAluno(aluno);
        turmaPOO.addAluno(new Aluno("José", 456));
        turmaPOO.addAluno(new Aluno("João", 789));

        for (Aluno al : turmaPOO.getAlunos()) {
            System.out.println(al.getMatricula() + " - " + al.getNome());
        }

        

    }

}
