public class Main {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(1,2);
        Retangulo r2 = new Retangulo(5,4);
        Retangulo r3 = new Retangulo(18,1);
        ListaRetangulo l1 = new ListaRetangulo();
        l1.adicionarRetangulo(r1);
        l1.adicionarRetangulo(r2);
        l1.adicionarRetangulo(r3);

        System.out.println(l1.maiorArea());
        System.out.println(l1.maiorPerimetro());
    }
}
