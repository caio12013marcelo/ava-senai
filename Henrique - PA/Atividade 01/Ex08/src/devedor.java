public class devedor {
    private String nome;
    private String cpf;
    private String uF;
    private double rendaAnual;
    private double aliquota;
    private double impostoApagar;

    public devedor(String nome, String cpf, String uF, double rendaAnual) {
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
    public void
}
