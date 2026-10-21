public class Main {
    public static void main(String[] args) {
        Flor obj1 = new Flor("tulipa","Claudio",10.20);
        Flor obj2 = new Flor("tulipa","homero",10.20);
        Flor obj3 = new Flor("Rosa","Claudio",12.20);
        Floricultura floricultura = new Floricultura();
        floricultura.adicionarFlores(obj1);
        floricultura.adicionarFlores(obj2);
        floricultura.adicionarFlores(obj3);

    }
}
