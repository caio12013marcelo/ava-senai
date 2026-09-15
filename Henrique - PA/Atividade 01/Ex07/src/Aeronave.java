public class Aeronave {
    String modelo;
    int pasageiros;
    double velocidadeMax;
    double capacidadeCombustivel;
    double combustivelPorMinuto;

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
