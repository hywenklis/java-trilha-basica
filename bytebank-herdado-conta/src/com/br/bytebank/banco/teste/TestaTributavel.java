package com.br.bytebank.banco.teste;

import com.br.bytebank.banco.modelo.CalculadorImposto;
import com.br.bytebank.banco.modelo.ContaCorrente;
import com.br.bytebank.banco.modelo.SeguroDeVida;

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
