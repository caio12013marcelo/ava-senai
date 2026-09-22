public class Devedor {
    private String nome;
    private String cpf;
    private String uF;
    private double rendaAnual;
    private double aliquota;
    private double impostoApagar;

    public Devedor(String nome, String cpf, String uF, double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.uF = uF;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome==null|| nome.isBlank()){
        }else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf==null|| cpf.isBlank()){
        }else {
            this.cpf = cpf;
        }
    }

    public String getuF() {
        return uF;
    }

    public void setuF(String uF) {
        if (uF==null|| uF.isBlank() || !uF.equals("PR")|| !uF.equals("SC")|| !uF.equals("PR")){
        }else {
            this.uF = uF;
        }
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual<=0){
            System.out.println("OXI, desempregado?? kkkkkkkkk");
        }
        this.rendaAnual = rendaAnual;
    }
    public double calcularImposto(){
        if (rendaAnual<=4000){
            return 0;
        } else if (rendaAnual<=9000) {
            return rendaAnual * 0.058;
        } else if (rendaAnual<=25000) {
            return rendaAnual * 0.15;
        } else if (rendaAnual<=35000) {
            return  rendaAnual * 0.275;
        }else{
            return rendaAnual * 0.30;
        }
    }

    @Override
    public String toString() {
        return "Devedor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", uF='" + uF + '\'' +
                ", rendaAnual=" + rendaAnual +
                ", aliquota=" + aliquota +
                ", impostoApagar=" + impostoApagar +
                '}';
    }
}
