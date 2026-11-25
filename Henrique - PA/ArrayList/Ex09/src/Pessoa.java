import java.time.LocalDate;

public class Pessoa {
    private LocalDate dtNascimento;
    private String nome;

    public Pessoa(String nome, LocalDate dtNascimento) {
        setNome(nome);
        setDtNascimento(dtNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome==null || nome.isBlank()){
            throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        if(dtNascimento==null || dtNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("nascimento ínvalido");
        }
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "dtNascimento=" + dtNascimento +
                '}';
    }
}
