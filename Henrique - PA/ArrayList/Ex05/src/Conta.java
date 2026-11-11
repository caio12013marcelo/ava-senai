import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Conta {
    private String nomeTitular;
    private double saldo;

    public Conta(double saldo,String nomeTitular) {
        setSaldo(saldo);
        setNomeTitular(nomeTitular);
    }
    public void depositar(double adicionaSaldo){
        if(adicionaSaldo<=0){
            throw new IllegalArgumentException("saldo paia");
        }
        setSaldo(saldo+adicionaSaldo);
    }
    public void sacar(double subtrairSaldo){
        if(subtrairSaldo<0){
            throw new IllegalArgumentException("saque paia");
        }
        setSaldo(saldo-subtrairSaldo);
    }
    public void transferir(Conta destinatario,double valor){
        destinatario.setSaldo(saldo+valor);
        setSaldo(saldo-valor);
    }
    public double investirValor(double valor,int tempo){
        double resultado = Math.pow(1.01,tempo);
        resultado = valor*resultado;
        setSaldo(saldo+resultado);

        return resultado;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String  toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
