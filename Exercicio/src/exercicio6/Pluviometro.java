package exercicio6;

public class Pluviometro {
    private double capacidade;

    public void getCapacidade(double leDouble) {
        capacidade = leDouble;
    }

    public double getCapacidade(Pluviometro pluviometro) {
        return capacidade;
    }
}
