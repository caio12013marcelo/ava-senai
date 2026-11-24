import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private LocalDate dtNascimento;

    public Pessoa(LocalDate dtNascimento) {
        setDtNascimento(dtNascimento);
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        if(dtNascimento==null || dtNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data de nascimento inválida");
        }
        this.dtNascimento = dtNascimento;
    }
    public boolean getMaioridade(){
         int maioridade = Period.between(dtNascimento,LocalDate.now()).getYears();
        if(maioridade>=18){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "dtNascimento=" + dtNascimento +
                '}';
    }
}
