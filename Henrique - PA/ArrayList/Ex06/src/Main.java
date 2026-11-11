public class Main {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("SC","Blumenau","210789","Sao paulo","5");
        Pessoa p1 = new Pessoa("carlos",e1 );
        System.out.println(p1);
    }
}
