import java.util.Scanner;

public class Ex06 {
    /*
    George Lucas utiliza uma fórmula para criar os nomes dos personagens em suas
    histórias (Jar Jar Binks, ObiWan Kenobi, etc).
    A fórmula, supostamente, é:

    Seu primeiro nome na série Star Wars:

     i.Pegue as três primeiras letras de seu sobrenome
     ii.Adicione a ele as duas primeiras letras de seu nome

    Seu sobrenome na série Star Wars:

        i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
        ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu

    Crie um método chamado generateStarWarsName que gera um nome completo Star
    Wars conforme descrito.
    Imprima o seu nome Star Wars
    As entradas serão os nomes completos.
    Para separar, por exemplo as três primeiras letras do seu sobrenome, use o método
    substring() das Strings
     */
    public static void main(String[] args) {
        recebeInfo();
    }

    public static void recebeInfo(){
        Scanner input = new Scanner(System.in);

        System.out.println("informe o seu nome : ");
        String nome= input.next();
        nome = nome.substring(0,2);

        System.out.println("Informe o seu sobrenome : ");
        String sobNome= input.next();
        sobNome = sobNome.substring(0,3);

        System.out.println("Informe o sobrenome da sua mãe : ");
        String nomeMae= input.next();
        nomeMae = nomeMae.substring(0,2);

        System.out.println("Informe o nome da sua cidade de onde nasceu : ");
        String cidadeNome= input.next();
        cidadeNome =  cidadeNome.substring(0,3);

        input.close();

        primeiroNome(nome,sobNome);
        segundoNome(nomeMae,cidadeNome);
    }

    public static void primeiroNome(String name,String sobreName){
        String primeiroNome= name+sobreName;
        System.out.println("Seu nome de StarWars será : "+primeiroNome);
    }

    public static void segundoNome(String sobMae,String cidade){
        String sobreNome=sobMae+cidade;
        System.out.println("E o seu sobre nome será : "+sobreNome);
    }

}
