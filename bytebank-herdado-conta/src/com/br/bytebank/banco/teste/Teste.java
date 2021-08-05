package com.br.bytebank.banco.teste;

import com.br.bytebank.banco.modelo.Cliente;
import com.br.bytebank.banco.modelo.ContaCorrente;
import com.br.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

    public static void main(String[] args) {

        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 22);

        System.out.println(cc.toString());
        System.out.println();
    }
}
