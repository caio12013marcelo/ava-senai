public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("B200","Civic","honda",2020,10000.0);
        Veiculo v2 = new Veiculo("A100","HB20","hyundai",2020,15000.0);
        Veiculo v3 = new Veiculo("C300","GOL","Volks",2016,12000.0);

        Concessionaria conc1= new Concessionaria();
        conc1.adicionarVeiculo(v1);
        conc1.adicionarVeiculo(v2);
        conc1.adicionarVeiculo(v3);

        System.out.println(conc1.obterVeiculoMaisbarato());
    }
}
