public class Mercado {
    String nome;
    int vendasAnualMacas;
    double precoMacas;
    int vendasAnualLaranjas;
    double precoLaranjas;
    public double obterReceitaMacas(){
        return vendasAnualMacas*precoMacas;
    }
    public double obterReceitaLaranja(){
        return vendasAnualLaranjas*precoLaranjas;
    }
}
