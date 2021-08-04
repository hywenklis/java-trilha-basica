package com.br.bytebank.banco.teste;

import com.br.bytebank.banco.modelo.Conta;
import com.br.bytebank.banco.modelo.ContaCorrente;
import com.br.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123,321);

        conta.deposita(200.0);
        try {
            conta.saca(400.0);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }
        System.out.println(conta.getSaldo());
    }
}
