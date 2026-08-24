import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[3];
        String[] opc={"limite mínimo ","limite máximo ","verificar "};

        for (int i =0 ; i< num.length;i++){
            System.out.println("Informe um número para "+opc[i]+(i+1)+"/3");
            num[i] = input.nextInt();
        }
        System.out.println(verificaLimite(num[0],num[2],num[1] ));
        input.close();
    }
    public static String verificaLimite(int min,int num,int max){
        String resposta;
        if (num>=min && num<=max){
            resposta = num+" está no intervalo aceito";
        }else{
            resposta = num+" está no intervalo incorreto";
        }

        return resposta;
    }
}
