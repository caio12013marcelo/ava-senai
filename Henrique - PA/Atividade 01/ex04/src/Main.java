import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Circulo c1 = new Circulo();
        c1.raio=5;

        System.out.println(df.format(c1.obterArea()));
    }
}
