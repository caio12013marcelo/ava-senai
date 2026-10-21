public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Caio",19,"12130","TI",7.4);
        Aluno a2 = new Aluno("Isabolas",17,"131313","TI",5);
        Aluno a3 = new Aluno("Rafael Cuca Beludo",25,"151231","TI",8.3);
        Aluno a4 = new Aluno("Inácio",84,"222222","Poliica",10);
        Aluno a5 = new Aluno("Bolsonaro",71,"222222","Poliica",4);
        SistemaAlunos senai = new SistemaAlunos();
        senai.adicionarAlunos(a1);
        senai.adicionarAlunos(a2);
        senai.adicionarAlunos(a3);
        senai.adicionarAlunos(a4);
        senai.adicionarAlunos(a5);

        System.out.println(senai.retornarAlunoIdadeMediaMaior("TI"));
        System.out.println(senai.retornarAlunoMatricula("12130"));
    }
}
