public class Veiculo {
    private String placa;
    private String modelo;
    private String Marca;
    private int ano;
    private double preco;

    public Veiculo(String placa, String modelo, String marca, int ano, double preco) {
        this.placa = placa;
        this.modelo = modelo;
        Marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", Marca='" + Marca + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }
}

