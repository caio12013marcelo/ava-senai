public class main {
    public static void main(String[] args) {
        Devedor devedorNum1= new Devedor("Carlos","111.213.123-12","PR",10000);
        Devedor devedorNum2= new Devedor("Miguel","377.445.653-89","SC",60000);
        Devedor devedorNum3= new Devedor("Leandro","869.671.432-10","PR",21500);
        Devedor devedorNum4= new Devedor("Pedro","722.554.789-41","PR",35032);
        Devedor devedorNum5= new Devedor("Fernando","552.112.899-21","PR",4000);
        Devedor[] devedores={devedorNum1,devedorNum2,devedorNum3,devedorNum4,devedorNum5};

        double maiorImposto=0;
        Devedor devedorMaiorImposto=null;

        for (int i = 0; i < devedores.length; i++) {
            if (devedores[i].calcularImposto()> maiorImposto){
                maiorImposto= devedores[i].calcularImposto();
                devedorMaiorImposto=devedores[i];
            }
        }
        System.out.println(devedorMaiorImposto);
    }
}
