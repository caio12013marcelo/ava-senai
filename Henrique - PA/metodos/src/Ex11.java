import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[3];

        for (int i=0;i< numeros.length;i++){
            System.out.println("Informe um número");
            numeros[i] = input.nextDouble();
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Média valores do Array é "+df.format(obterMedia(numeros)));
        System.out.println("Maior valor do Array é "+df.format(obterMaiorValor(numeros)));
        System.out.println("Menor valor do Array é "+df.format(obterMenorValor(numeros)));
        input.close();
    }
    public static double obterMedia (double[] num){
        double soma=0;
        for (int i=0;i<num.length;i++){
            soma= soma+num[i];
        }
        double media = soma/3;

        return media;
    }
    public static double obterMaiorValor(double[] num){
        double maiorValor=Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (maiorValor<num[i]){
                maiorValor=num[i];
            }
        }
        return maiorValor;
    }
    public static double obterMenorValor(double[] num){
        double menorValor=Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (menorValor>num[i]){
                menorValor= num[i];
            }
        }
        return menorValor;
    }

}
