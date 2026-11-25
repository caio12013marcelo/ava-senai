import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", LocalDate.of(2005,10,25));
        Pessoa p2 = new Pessoa("Maria", LocalDate.of(2004,8,27));

        Familia f1 = new Familia();
        f1.adicionarPessoa(p1);
        f1.adicionarPessoa(p2);

        System.out.println(f1.encontrarPessoaMaisVelha());
    }
}
