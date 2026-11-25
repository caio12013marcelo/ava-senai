import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Familia {
    private List<Pessoa> listaPessoas;

    public Familia() {
        listaPessoas = new ArrayList<>();
    }
    public void adicionarPessoa(Pessoa p){
        listaPessoas.add(p);
    }
    public Pessoa encontrarPessoaMaisVelha(){
        LocalDate dataMaisVelha= LocalDate.now();
        Pessoa pessoaMaisVelha=null;
        for (Pessoa p : listaPessoas) {
            if(p.getDtNascimento().isBefore(dataMaisVelha)){
                dataMaisVelha = p.getDtNascimento();
                pessoaMaisVelha = p;
            }
        }
        return pessoaMaisVelha;
    }
}
