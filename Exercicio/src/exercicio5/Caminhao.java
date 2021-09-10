package exercicio5;
public class Caminhao extends Pluviometro {

    private final String tipoCaminhao;
    private int cargaCaminhao;

    public Caminhao(String tipo, int quantidadePluviometro, String tipoPluviometro) {
        this.tipoCaminhao = tipo;
        this.quantidadePluviometro = quantidadePluviometro;
        this.tipoPluviometro = tipoPluviometro;
    }

    public int getCargaCaminhao() {
        return cargaCaminhao = quantidadePluviometro;
    }

    @Override
    public String toString() {
        return "CAMINHÃO{" +
                "TIPO = '" + tipoCaminhao + '\'' +
                ", PLUVIÔMETRO TRANSPORTADO = " + quantidadePluviometro +
                ", TIPO DO PLUVIÔMETRO = " + tipoPluviometro +
                '}';
    }
}