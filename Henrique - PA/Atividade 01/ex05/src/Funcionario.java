public class Funcionario {
    String nome;
    String sobrenome;
    double salarioMensal;
    double aumentoSalarial;
    public String obterNomeCompleto(){
        return nome+" "+sobrenome;
    }
    public double obterSalarioAnual(){
        return salarioMensal*12;
    }
    public double obterReajusteSalarial(){
        return aumentoSalarial/salarioMensal*100-100;
    }
}
