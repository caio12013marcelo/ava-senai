public class Main {
    public static void main(String[] args) {
        Mercado unidadeDeBlumenau= new Mercado();
        unidadeDeBlumenau.nome="Atacadao";
        unidadeDeBlumenau.laranja=200;
        unidadeDeBlumenau.precoLaranja=2.99;
        unidadeDeBlumenau.macas=100;
        unidadeDeBlumenau.precoMacas=7.90;
        System.out.println(unidadeDeBlumenau.nome);
        System.out.println("Laranja/ano = "+unidadeDeBlumenau.laranja);
        System.out.println("Preço de laranja = "+unidadeDeBlumenau.precoLaranja);
        System.out.println("Maçã/ano = "+unidadeDeBlumenau.macas);
        System.out.println("Preço de Maçã = "+unidadeDeBlumenau.precoMacas);
        System.out.println("");
        Mercado unidadeDeJoinville= new Mercado();
        unidadeDeJoinville.nome="Cooper";
        unidadeDeJoinville.laranja=350;
        unidadeDeJoinville.precoLaranja=1.50;
        unidadeDeJoinville.macas=200;
        unidadeDeJoinville.precoMacas=5.43;
        System.out.println(unidadeDeJoinville.nome);
        System.out.println("Laranja/ano = "+unidadeDeJoinville.laranja);
        System.out.println("Preço de laranja = "+unidadeDeJoinville.precoLaranja);
        System.out.println("Maçã/ano = "+unidadeDeJoinville.macas);
        System.out.println("Preço de Maçã = "+unidadeDeJoinville.precoMacas);
        System.out.println("");
        Mercado unidadeDeFlorianopolis= new Mercado();
        unidadeDeFlorianopolis.nome="FloripaMercado";
        unidadeDeFlorianopolis.laranja=643;
        unidadeDeFlorianopolis.precoLaranja=5.50;
        unidadeDeFlorianopolis.macas=323;
        unidadeDeFlorianopolis.precoMacas=8.50;
        System.out.println(unidadeDeFlorianopolis.nome);
        System.out.println("Laranja/ano = "+unidadeDeFlorianopolis.laranja);
        System.out.println("Preço de laranja = "+unidadeDeFlorianopolis.precoLaranja);
        System.out.println("Maçã/ano = "+unidadeDeFlorianopolis.macas);
        System.out.println("Preço de Maçã = "+unidadeDeFlorianopolis.precoMacas);
        System.out.println("");
    }
}