import java.util.ArrayList;
import java.util.List;

public class SistemaAlunos {
    private List<Aluno> alunos;

    public SistemaAlunos() {
        alunos = new ArrayList<>();
    }

    public void adicionarAlunos(Aluno a) {
        alunos.add(a);
    }

    public List<Aluno> retornarAlunoIdadeMediaMaior(String curso) {
        List<Aluno> alunosMaior = new ArrayList<>();
        for (Aluno a : alunos) {
            if (a.getIdade() >= 18 || a.getMediaFinal() > 6 || curso.equals("TI")) {
                alunosMaior.add(a);
            }
        }
        return alunosMaior;
    }

    public Aluno retornarAlunoMatricula(String matricula) {
        for (Aluno a : alunos) {
            if (matricula.equals(a.getMatricula())) {
                return a;
            }
        }
        return null;
    }
}
