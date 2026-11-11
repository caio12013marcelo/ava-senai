public class Endereco {
    private String uf;
    private String cidade;
    private String cep;
    private String logadouro;
    private String numeroCasa;


    public Endereco(String uf, String cidade, String cep, String logadouro, String numeroCasa) {
        setUf(uf);
        setCidade(cidade);
        setCEP(cep);
        setLogadouro(logadouro);
        setNumeroCasa(numeroCasa);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep(String cep) {
        return cep;
    }

    public void setCEP(String cep) {
        this.cep = cep ;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", CEP='" + cep + '\'' +
                ", logadouro='" + logadouro + '\'' +
                ", numeroCasa='" + numeroCasa + '\'' +
                '}';
    }
}
