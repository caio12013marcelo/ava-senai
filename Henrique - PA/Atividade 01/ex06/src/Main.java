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
        double receitaMacaTotal=0;
        double receitaLaranjaTotal=0;

        double menorReceitaLaranja= Double.MAX_VALUE;

        double maiorReceitatotal= Double.MAX_VALUE;

        double menorReceitaTotal= Double.MAX_VALUE;

        double segundaMaiorReceita=mercados[0].obterReceitaTotal();

        for (int i = 0; i < mercados.length; i++) {
            receitaLaranjaTotal= receitaLaranjaTotal+mercados[i].obterReceitaLaranja();
            receitaMacaTotal= receitaMacaTotal+mercados[i].obterReceitaMacas();
            if (mercados[i].obterReceitaMacas()>maiorReceitaMaca){
                maiorReceitaMaca=mercados[i].obterReceitaMacas();
            }
            if(menorReceitaLaranja>mercados[i].obterReceitaLaranja()){
                menorReceitaLaranja=mercados[i].obterReceitaLaranja();
            }
            if (maiorReceitatotal>mercados[i].obterReceitaTotal()){
                maiorReceitatotal=mercados[i].obterReceitaTotal();
            }
            if (menorReceitaTotal<mercados[i].obterReceitaTotal()){
                menorReceitaTotal=mercados[i].obterReceitaTotal();
            }
            if (maiorReceitatotal>segundaMaiorReceita && segundaMaiorReceita>menorReceitaTotal){
                segundaMaiorReceita=mercados[i].obterReceitaTotal();
            }

        }
        if (receitaMacaTotal>receitaLaranjaTotal){
            System.out.println("Vendou mais maçãs");
        }else{
            System.out.println("Vendou mais laranjas");
        }

        System.out.println(maiorReceitaMaca);
        System.out.println(menorReceitaLaranja);
        System.out.println(maiorReceitatotal);
        System.out.println(segundaMaiorReceita);
    }
}
