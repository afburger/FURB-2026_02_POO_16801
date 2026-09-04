package exemplos.unidade03.associacao;

import java.util.ArrayList;

public class Turma {

    private String materia;

    public Turma(String materia) {
        this.materia = materia;
    }

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String getMateria() {
        return materia;
    }
}
