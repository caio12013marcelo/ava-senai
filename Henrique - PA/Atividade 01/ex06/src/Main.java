public class Main {
    public static void main(String[] args) {
        Mercado[] mercados = new Mercado[3];
        Mercado atacadao = new Mercado();
        atacadao.nome="aulmartiy";
        atacadao.vendasAnualLaranjas=227;
        atacadao.vendasAnualMacas=365;
        atacadao.precoLaranjas=7.87;
        atacadao.precoMacas=2.23;
        mercados[0]=atacadao;

        Mercado feirao = new Mercado();
        feirao.nome="bananão verde";
        feirao.vendasAnualLaranjas=354;
        feirao.vendasAnualMacas=450;
        feirao.precoMacas=3.50;
        feirao.precoLaranjas=2.32;
        mercados[1]=feirao;

        Mercado shopping = new Mercado();
        shopping.nome="Americas";
        shopping.vendasAnualLaranjas=120;
        shopping.vendasAnualMacas=50;
        shopping.precoMacas=8;
        shopping.precoLaranjas=5.56;
        mercados[2]=shopping;

        double maiorReceitaMaca= Double.MIN_VALUE;
        Mercado mercadoMaiorReceitaMaca = null;
        double receitaMacaTotal=0;
        double receitaLaranjaTotal=0;

        double menorReceitaLaranja= Double.MAX_VALUE;
        Mercado mercadoMenorReceitaLaranja = null;
        double maiorReceitatotal= Double.MIN_VALUE;
        Mercado mercadoMaiorReceitaTotal = null;
        double menorReceitaTotal= Double.MAX_VALUE;
        Mercado mercadoMenorReceitaTotal = null;
        double segundaMaiorReceita=mercados[0].obterReceitaTotal();
        Mercado mercadoSegundaMaiorReceitaTotal = null;

        for (int i = 0; i < mercados.length; i++) {
            receitaLaranjaTotal= receitaLaranjaTotal+mercados[i].obterReceitaLaranja();
            receitaMacaTotal= receitaMacaTotal+mercados[i].obterReceitaMacas();
            if (mercados[i].obterReceitaMacas()>maiorReceitaMaca){
                maiorReceitaMaca=mercados[i].obterReceitaMacas();
                mercadoMaiorReceitaMaca= mercados[i];
            }
            if(menorReceitaLaranja>mercados[i].obterReceitaLaranja()){
                menorReceitaLaranja=mercados[i].obterReceitaLaranja();
                mercadoMenorReceitaLaranja= mercados[i];
            }
            if (mercados[i].obterReceitaTotal()>maiorReceitatotal){
                maiorReceitatotal=mercados[i].obterReceitaTotal();
                mercadoMaiorReceitaTotal=mercados[i];
            }
            if (menorReceitaTotal>=mercados[i].obterReceitaTotal()){
                menorReceitaTotal=mercados[i].obterReceitaTotal();
                mercadoMenorReceitaTotal= mercados[i];
            }
            if (maiorReceitatotal>segundaMaiorReceita && segundaMaiorReceita!=maiorReceitatotal){
                segundaMaiorReceita=mercados[i].obterReceitaTotal();
                mercadoSegundaMaiorReceitaTotal=mercados[i];
            }else{
                mercadoSegundaMaiorReceitaTotal=mercados[i];
            }

        }
        if (receitaMacaTotal>receitaLaranjaTotal){
            System.out.println("Vendou mais maçãs");
        }else{
            System.out.println("Vendou mais laranjas");
        }

        System.out.println(mercadoMaiorReceitaMaca.nome+" vendeu mais maçãs ="+maiorReceitaMaca);
        System.out.println(mercadoMenorReceitaLaranja.nome+" vendeu menos Laranjas ="+menorReceitaLaranja);
        System.out.println(mercadoMaiorReceitaTotal.nome+" teve mais vendas = "+maiorReceitatotal);
        System.out.println(mercadoSegundaMaiorReceitaTotal.nome+" foi segunda maior em vendas="+segundaMaiorReceita);
    }
}
