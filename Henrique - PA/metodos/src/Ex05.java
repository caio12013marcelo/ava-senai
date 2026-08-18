import java.util.Scanner;

public class Ex05 {
    /*
    Faça um método que receba três números inseridos pelo usuário, esses números
    serão: um número "base" e mais dois outros números que o usuário inseriu
    Imprima qual dos dois últimos números está mais perto do primeiro número "base"
     */
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
        compara(valores[0],valores[1],valores[2]);
    }
    public static void compara(int base,int valor2,int valor3){
        int compara1= base-valor2;
        int compara2= base-valor3;

        if (compara1>compara2){
            System.out.println("O segundo valor é mais próximo : "+valor2);
        } else if (compara2>compara1) {
            System.out.println("O primeiro número é mais próximo : "+valor3);
        } else{
            System.out.println("Os dois estão igualmente próximos");
        }
    }
}
