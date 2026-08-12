import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = input.nextInt();
        input.close();
        switch (num){
            case 01:
               verao();
               break;
            case 02:
                inverno();
                break;
            case 03:
                primavera();
                break;
            case 04:
                outono();
                break;
            default:
                System.out.println("nada");
                break;

        }

    }
    public static void user(){

    }
    public static void verao(){
        System.out.println("é verão");
        System.out.println("vai para a piscina");
    }
    public static void inverno(){
        System.out.println("é frio");
        System.out.println("fica em casa");
    }
    public static void outono(){
        System.out.println("é outono");
        System.out.println("coma muito");
    }
    public static void primavera(){
        System.out.println("é primavera");
        System.out.println("vai hibernar");
    }
}
