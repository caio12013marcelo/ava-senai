import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número 1- verão 2-inverno 3-primavera 4-outono: ");
        int escolha = input.nextInt();
        input.close();

        System.out.println(escolherOpcao(escolha));
    }
    public static String escolherOpcao(int opcao){

     String resposta = switch (opcao) {
            case 1 ->verao();
         default -> falso();
        };
     return resposta;
    }
    public static String verao(){
        String answer ="verão";
        return answer;
    }
    public static String falso(){
        String answer = "falso";
        return answer;
    }
}
