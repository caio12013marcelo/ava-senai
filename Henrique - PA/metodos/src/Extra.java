import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        recebervalores();
    }
    public static void desempenharCalculo(double num1, double num2, double num3){
        double resultado = (num1+num2)*num3;
        System.out.println(resultado);
    }
    public static void recebervalores(){
        Scanner input= new Scanner(System.in);
        int[] valores= new int[3];
        for (int i=0;i<valores.length;i++){
            System.out.println("Informe um valor: ");
            valores[i]= input.nextInt();
        }
        input.close();
        desempenharCalculo(valores[0],valores[1],valores[2]);
    }

}
