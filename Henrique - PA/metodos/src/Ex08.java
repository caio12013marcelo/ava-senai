import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double somaNotas=0;
        for (int i=0;i<=3;i++){
            System.out.println("Informe a nota do aluno "+(i+1)+"/3");
            double nota = input.nextInt();
            somaNotas =  somaNotas+nota;
        }
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("media do aluno é "+df.format(calcularMedia(somaNotas)));
        input.close();
    }
    public static double calcularMedia(double totalNotas){
        double media = totalNotas/3;
        return media;
    }
}
