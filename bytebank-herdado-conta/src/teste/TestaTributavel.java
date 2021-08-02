package teste;

import modelo.CalculadorImposto;
import modelo.ContaCorrente;
import modelo.SeguroDeVida;

public class TestaTributavel {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(222,333);
        contaCorrente.deposita(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.registra(contaCorrente);
        calculadorImposto.registra(seguroDeVida);
        System.out.println(calculadorImposto.getTotalImposto());
    }
}
