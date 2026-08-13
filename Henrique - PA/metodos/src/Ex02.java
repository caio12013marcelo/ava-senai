
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    /*
    2)
    Faça um método para seus colegas mais próximos
    O método deve imprimir:
    O nome dele(a) é [nome]
    Ele(a) tem [idade] anos
    Ele(a) é estudante de desenvolvimento de sistemas
    (Em prints separados)
    Faça com que o método seja uma expressão verbal com o nome do seu colega.
    O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser
    executado.
    */
    public static void main(String[] args) {
        callUser();
    }

    public static void callUser() {
        Scanner input= new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = input.next().toLowerCase(Locale.ROOT);

        switch (nome) {
            case "isabelli":
                isabelli();
                break;

            case "caio":
                caio();
                break;

            case "daniele":
                daniele();
                break;
            case "hercules":
                hercules();
                break;
            default:
                System.out.println("usuários não declarado");
                break;
        }
        input.close();
    }

    public static void isabelli() {
        System.out.println("Nome dela é Isabelli");
        System.out.println("Tem 18 anos");
        System.out.println("Ela é estudante de desenvolvimento de sistemas");
    }
    public static void caio(){
        System.out.println("Nome dele é Caio");
        System.out.println("Tem 18 anos");
        System.out.println("Ele é estudante de desenvolvimento de sistemas");
    }
    public static void daniele(){
        System.out.println("Nome dela é Daniele");
        System.out.println("Tem 37 anos");
        System.out.println("Ela é estudante de desenvolvimento de sistemas");
    }
    public static void hercules(){
        System.out.println("Nome dele é Hércules");
        System.out.println("Tem 18 anos");
        System.out.println("Ele é estudante de desenvolvimento de sistemas");
    }
}
