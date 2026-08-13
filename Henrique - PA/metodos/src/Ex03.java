import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        recebervalor();
    }
    public static void recebervalor(){
        Scanner input= new Scanner(System.in);
        System.out.println("Informe valor: ");
        int valor=input.nextInt();
        mostrarValores(valor);
    }
    public static void mostrarValores(int num){
        for (int i=0;i<20;i++){
            num++;
            System.out.print(num+" - ");
        }
    }

}
