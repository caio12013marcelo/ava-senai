import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> estoque;

    public Loja(){
        estoque = new ArrayList<>();
    }
    public void adicionarProduto(Produto p){
        estoque.add(p);
    }
    public Produto produtoMaisCaro(String marca){
        Produto produtoMaisCaro = null;
        double precoMaior = Double.MIN_VALUE;
        for(Produto p : estoque){
            if (marca.equals(p.getMarca()) && p.getPreco()>precoMaior){
                produtoMaisCaro = p;
                precoMaior = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }
    public List<Produto> buscaEstoque(double precoIncial,double precoFinal,String marca){
        List<Produto> buscaEstoque = new ArrayList<>();

        for (Produto p : estoque){
            if(p.getPreco()>=precoIncial && p.getPreco()<=precoFinal && p.getMarca().equals(marca)){
                buscaEstoque.add(p);
            }
        }
        return buscaEstoque;
    }
}
