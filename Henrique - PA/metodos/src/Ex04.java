import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
       recebaValores();
    }
    public static void recebaValores(){
        Scanner input = new Scanner(System.in);
        int[] valores = new int[3];

        for (int i=0;i<valores.length;i++){
            System.out.println("Escreva um valor: ");
            valores[i]= input.nextInt();
        }
        input.close();
        maiorVetorNum(valores);
        menorVetorNum(valores);
        somaValores(valores);
    }
    public static void maiorVetorNum(int[] maior){
        int valorMaior=maior[0];
        for (int i=0;i< maior.length;i++){
            if(maior[i]>valorMaior){
                valorMaior=maior[i];
            }
        }
        System.out.println("Maior valor é : "+valorMaior);
    }
    public static void menorVetorNum(int[] menor){
        int valorMenor=menor[0];
        for (int i=0;i< menor.length;i++){
            if(menor[i]<valorMenor){
                valorMenor=menor[i];
            }
        }
        System.out.println("Menor valor é : "+valorMenor);
    }
    public static void somaValores(int[] soma){
        int adicao=0;
        for (int i=0;i< soma.length;i++){
            adicao=adicao+soma[i];
        }
        System.out.println("Soma dos valores é : "+adicao);
    }
}
