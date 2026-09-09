public class Funcionario {
    String nome;
    String sobrenome;
    double salarioMensal;
    public String obterNomeCompleto(){
        return nome+" "+sobrenome;
    }
    public double obterSalarioAnual(){
        return salarioMensal*12;
    }
    public void aumentarSalario(double percentaulAumento){
        double aumento= salarioMensal*percentaulAumento/100;
        double salarioFinal= salarioMensal+aumento;
        salarioMensal = salarioFinal;
    }
}
