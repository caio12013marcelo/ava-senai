import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Funcionario empregado1= new Funcionario();
        empregado1.nome="Isabelli";
        empregado1.sobrenome="gellinski";
        empregado1.salarioMensal=1200;
        empregado1.aumentoSalarial=1320;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(empregado1.obterNomeCompleto());
        System.out.println(df.format(empregado1.obterReajusteSalarial())+"%");
        System.out.println(empregado1.obterSalarioAnual());
    }
}
