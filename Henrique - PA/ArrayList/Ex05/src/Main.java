import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(100,"Roger Ordolindo Leonardo Adriano");
        Conta c2 = new Conta(100,"Samuel Eduardo Xuxa Osmar");

        c1.transferir(c2,100);
        System.out.println(c1);
        System.out.println(c2);
        c1.depositar(100);
        System.out.println(c1);
        c2.sacar(100);
        System.out.println(c2);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(c2.investirValor(100,3)));
    }

}
