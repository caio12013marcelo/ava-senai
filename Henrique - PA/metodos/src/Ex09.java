import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número");
        int numero = input.nextInt();

        System.out.println(verificarPar(numero));
        input.close();
    }
    public static boolean verificarPar(int num){
        boolean par;
        if(num % 2 ==0){
            par = true;
        }else{
            par=false;
        }
        return par;
    }
}
