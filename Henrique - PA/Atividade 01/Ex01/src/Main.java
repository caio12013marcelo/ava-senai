public class Main {
    public static void main(String[] args) {
        usuario carlos = new usuario();
        carlos.nome="Carlos";
        carlos.dtNascimento="21/06/1945";
        carlos.estadoCivil="Solteiro";
        carlos.sexo='a';
        System.out.printf("Nome: "+carlos.nome+"\nSexo: "+carlos.sexo+"\nData de nascimento: "+carlos.dtNascimento+"\nEstado Civil: "+carlos.estadoCivil);
        System.out.println("\n==##==");
        usuario max= new usuario();
        max.nome="Max";
        max.sexo='H';
        max.dtNascimento="23/09/2001";
        max.estadoCivil="casado";
        System.out.printf("Nome: "+max.nome+"\nSexo: "+max.sexo+"\nData de nascimento: "+max.dtNascimento+"\nEstado Civil: "+max.estadoCivil);
    }
}
