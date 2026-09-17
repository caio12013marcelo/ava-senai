public class Main {
    public static void main(String[] args) {
        Aeronave aeronave1= new Aeronave("Natan",120,820,26000,100);
        Aeronave aeronave2= new Aeronave("Airbus",182,780,16521,80);
        Aeronave aeronave3= new Aeronave("Boeing",300,580,18000,120);
        Aeronave aeronave4= new Aeronave("Trojani",2,5000,10000,50);
        Aeronave[] aeronaves = {aeronave1,aeronave2,aeronave3,aeronave4};
        int ipTempoVoo=obterAeronaveDeMaiorTempoVoo(aeronaves);
        int ipMaiorCargaPassageiros=obterAeronaveMaiorCargaPassageiros(aeronaves);
        int ipMaiorLongividadeMax=obterAeronaveMaiorLongividade(aeronaves);
        System.out.println("Aeronave com mais tempo de voo \n"+aeronaves[ipTempoVoo].toString());
        System.out.println("\n====###====\n");
        System.out.println("Aeronave com a maior capacidade de passageiros \n"+aeronaves[ipMaiorCargaPassageiros].toString());
        System.out.println("\n====###====\n");
        System.out.println("Aeronave com a maior Longividade de voo na velocidade máxima \n"+aeronaves[ipMaiorLongividadeMax].toString());
    }
    public static int obterAeronaveDeMaiorTempoVoo(Aeronave[] aeronaves){
        int ip=0;
        double maiorTempoVoo= Integer.MIN_VALUE;
        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i].calcularTempoDeVoo()>maiorTempoVoo){
                maiorTempoVoo= aeronaves[i].calcularTempoDeVoo();
                ip=i;
            }
        }
        return ip;
    }
    public static int obterAeronaveMaiorCargaPassageiros(Aeronave[] aeronaves){
        int ip=0;
        double maiorCargaPassageiros= Integer.MIN_VALUE;
        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i].getPasageiros()>maiorCargaPassageiros){
                maiorCargaPassageiros= aeronaves[i].getPasageiros();
                ip=i;
            }
        }
        return ip;
    }
    public static int obterAeronaveMaiorLongividade(Aeronave[] aeronaves){
        int ip=0;
        double MaiorLongividadeMax= Integer.MIN_VALUE;
        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i].calcularLongividadeVooMax()>MaiorLongividadeMax){
                MaiorLongividadeMax= aeronaves[i].calcularLongividadeVooMax();
                ip=i;
            }
        }
        return ip;
    }
}
