public class Flor {
    private String nomeFlor;
    private String nomeCliente;
    private double preco;

    public Flor(String nomeFlor, String nomeCliente, double preco) {
        setNomeCliente(nomeCliente);
        setNomeFlor(nomeFlor);
        setPreco(preco);
    }

    public String getNomeFlor() {
        return nomeFlor;
    }

    public void setNomeFlor(String nomeFlor) {
        this.nomeFlor = nomeFlor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "nomeFlor='" + nomeFlor + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", preco=" + preco +
                '}';
    }
}
