public class Aeronave {
    private String modelo;
    private int pasageiros;
    private double velocidadeMax;
    private double capacidadeCombustivel;
    private double combustivelPorMinuto;

    public Aeronave(String modelo, int pasageiros, double velocidadeMax, double capacidadeCombustivel, double combustivelPorMinuto) {
        this.modelo = modelo;
        this.pasageiros = pasageiros;
        this.velocidadeMax = velocidadeMax;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.combustivelPorMinuto = combustivelPorMinuto;
    }
    public double calcularTempoDeVoo(){
        return capacidadeCombustivel/combustivelPorMinuto;
    }
    public double calcularLongividadeVooMax(){
        return calcularTempoDeVoo()/velocidadeMax;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            System.out.println("erro");
        } else{
            this.modelo = modelo;
     }
    }

    public int getPasageiros() {
        return pasageiros;
    }

    public void setPasageiros(int pasageiros) {
        if (pasageiros<=0){
            System.out.println("Erro,quantia errada de passageiros");
        }else {
            this.pasageiros = pasageiros;
        }
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        if(velocidadeMax<=0){
            System.out.println("Erro,quantia inesperada de velocidade máxima");
        }else {
            this.velocidadeMax = velocidadeMax;
        }
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        if(capacidadeCombustivel<=0){
            System.out.println("Erro,quantia errada de capacidade de combustivel");
        }else {
            this.capacidadeCombustivel = capacidadeCombustivel;
        }
    }

    public double getCombustivelPorMinuto() {
        return combustivelPorMinuto;
    }

    public void setCombustivelPorMinuto(double combustivelPorMinuto) {
        if (combustivelPorMinuto<=0){
            System.out.println("Erro, quantia errada de combustivel por minuto");
        }else {
            this.combustivelPorMinuto = combustivelPorMinuto;
        }
    }

    @Override
    public String toString() {
        return "Aeronave{\n" +
                "modelo='" + modelo + '\'' +
                ",\n pasageiros=" + pasageiros +
                ",\n velocidadeMax=" + velocidadeMax +
                ",\n capacidadeCombustivel=" + capacidadeCombustivel +
                ",\n combustivelPorMinuto=" + combustivelPorMinuto +
                "\n}";
    }

}
