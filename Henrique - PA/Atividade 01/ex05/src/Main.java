import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Funcionario empregado1= new Funcionario();
        empregado1.nome="Isabelli";
        empregado1.sobrenome="gellinski";
        empregado1.salarioMensal=1200;
        double aumentoSalarial=10;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(empregado1.obterNomeCompleto());
        System.out.println(empregado1.obterSalarioAnual());
        empregado1.aumentarSalario(10);
        System.out.println(empregado1.salarioMensal);
    }
}
