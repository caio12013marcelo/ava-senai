import com.sun.source.tree.IfTree;

public class Produto {
    private String modelo;
    private String marca;
    private double preco;
    private int quantiaEstoque;

    public Produto(String modelo, String marca, double preco, int quantiaEstoque) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setQuantiaEstoque(quantiaEstoque);
    }
    public void adicionarQuantiaEstoque(int somaQuantia){
        if(somaQuantia<=0){
            throw new IllegalArgumentException("Não é possível somar 0 ou valores negativos");
        }
        quantiaEstoque=quantiaEstoque+somaQuantia;
    }
    public void venderQuantiaProduto(int venda){
        if(venda>quantiaEstoque){
            throw new IllegalArgumentException("Venda a cima do estoque");
        }
        quantiaEstoque= quantiaEstoque-venda;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo.isBlank() || modelo==null){
            throw new IllegalArgumentException("Nome vazio");
        }
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca.isBlank() || marca==null){
            throw new IllegalArgumentException("Nome vazio");
        }
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco<0){
            throw new IllegalArgumentException("Preço negativo");
        }
        this.preco = preco;
    }

    public int getQuantiaEstoque() {

        return quantiaEstoque;
    }

    public void setQuantiaEstoque(int quantiaEstoque) {
        if(quantiaEstoque<0){
            throw new IllegalArgumentException("estoque negativo");
        }
        this.quantiaEstoque = quantiaEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                ", quantiaEstoque=" + quantiaEstoque +
                '}';
    }
}
