import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalAlunos=3;

        double somaNotas=receberNotas(input,totalAlunos);
        double mediaFinal=calcularMedia(somaNotas,totalAlunos);

        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("media do aluno é "+df.format(mediaFinal));
        input.close();
    }
    public static double receberNotas(Scanner input, double totalAlunos){
        double totalNotas=0;

        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("Informe um nota "+(i+1)+"/"+totalAlunos);
            double nota= input.nextDouble();
            totalNotas= totalAlunos+nota;
        }

        return totalNotas;
    }
    public static double calcularMedia(double totalNotas,double totalAlunos){
        double mediaNotas= totalNotas/totalAlunos;
        return mediaNotas;
    }
}
