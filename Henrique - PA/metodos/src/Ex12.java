import java.util.Locale;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = input.next();

        nome= nome.toUpperCase();

        System.out.println(obterCaractere(nome));
        input.close();
    }
    public static String obterCaractere(String nome){
        String caracteres;
        if (nome.length()% 2 ==0){
            caracteres= "A palavra/nome é Par : "+ nome.substring(0,1);
        }else{
            caracteres= "A palavra/nome é Impar : "+nome.substring(0,2);
        }

        return caracteres;
    }
}
