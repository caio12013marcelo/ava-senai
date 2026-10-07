import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();

        num.add(20);
        num.add(23);
        num.add(25);
        System.out.println("Informe um número");
        int numUser= input.nextInt();
        if(num.contains(numUser)){
            System.out.println("Número de índice : "+num.indexOf(numUser));
        }else{
            System.out.println("Número não se encontra");
        }
    }
}
