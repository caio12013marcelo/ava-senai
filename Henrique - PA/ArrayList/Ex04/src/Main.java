public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("cimento","riachuelo",9.99,10);
        Produto p2 = new Produto("vergalhão","rihappy",10.99,10);
        Produto p3 = new Produto("madeira","rihappy",12.99,15);
        Produto p4 = new Produto("telha","honda",16.99,15);
        Produto p5 = new Produto("argamassa","positivo",19.99,32);
        Produto p6 = new Produto("areia","rihappy",8.99,15);
        Loja lojaConstrucao = new Loja();
        lojaConstrucao.adicionarProduto(p1);
        lojaConstrucao.adicionarProduto(p2);
        lojaConstrucao.adicionarProduto(p3);
        lojaConstrucao.adicionarProduto(p4);
        lojaConstrucao.adicionarProduto(p5);
        lojaConstrucao.adicionarProduto(p6);
        System.out.println(lojaConstrucao.produtoMaisCaro("rihappy"));
        System.out.println(lojaConstrucao.buscaEstoque(10,13,"rihappy"));
    }
}
