package exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Caminhao {

    private String tipo;
    private double cargaAtual;
    List<Pluviometro> pluviometros = new ArrayList<>();
    private int quantidadePluviometro;

    public double getCargaAtual() {
        return cargaAtual;
    }

    public String getTipo() {
        return tipo;
    }
    public void getTipo(String leString) {
        tipo = leString;
    }

    public int getQuantidadePluviometro() {
        return quantidadePluviometro;
    }
    public void getQuantidadePluviometro(int leInteiro) {
        quantidadePluviometro = leInteiro;
    }

    public void adicionaPluviometro(Pluviometro pluviometro) {
        pluviometros.add(pluviometro);
        cargaAtual += pluviometro.getCapacidade(pluviometro);
    }
}
