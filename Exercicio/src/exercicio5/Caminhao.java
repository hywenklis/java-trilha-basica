package exercicio5;

public class Caminhao extends Pluviometro {


    private final String tipo;
    private double cargaCaminhao;

    public Caminhao(String tipo, int quantidadePluviometro, double capacidadePluviometro) {
        this.tipo = tipo;
        this.quantidadePluviometro = quantidadePluviometro;
        this.capacidadePluviometro = capacidadePluviometro;
        this.cargaCaminhao += quantidadePluviometro * capacidadePluviometro;
    }

    public double getCargaCaminhao() {
        return cargaCaminhao;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "tipo='" + tipo + '\'' +
                ", quantidadePluviometro=" + quantidadePluviometro +
                ", cargaCaminhao=" + cargaCaminhao +
                ", capacidadePluviometro=" + capacidadePluviometro +
                '}';
    }
}