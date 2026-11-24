import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        LocalDate dtNascimetoCaio = LocalDate.of(2007,11,21);
        LocalDate dtNascimentoRay = LocalDate.of(2008,2,17);

        if(dtNascimentoRay.isAfter(dtNascimetoCaio)){
            System.out.println("Ray é mais novo");
        }else{
            System.out.println("Caio é mais novo");
        }
        int idadeCaio = Period.between(dtNascimetoCaio,hoje).getYears()
                ;
        System.out.println(idadeCaio);

        Pessoa p1 = new Pessoa(LocalDate.of(2007,11,21));
        System.out.println(p1.getMaioridade());
    }
}
