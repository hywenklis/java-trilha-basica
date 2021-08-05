package com.br.bytebank.banco.teste;

import com.br.bytebank.banco.modelo.Conta;
import com.br.bytebank.banco.modelo.ContaCorrente;
import com.br.bytebank.banco.modelo.ContaPoupanca;
import com.br.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorReferencias {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente cc1 = new ContaCorrente(222,222);
        guardador.adiciona(cc1);

        ContaCorrente cc2 = new ContaCorrente(122,242);
        guardador.adiciona(cc2);

        ContaPoupanca cc3 = new ContaPoupanca(100,200);
        guardador.adiciona(cc3);


        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());

        System.out.println(guardador.getReferencia(2));
    }
}
