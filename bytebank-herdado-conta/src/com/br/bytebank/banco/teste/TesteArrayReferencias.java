package com.br.bytebank.banco.teste;

import com.br.bytebank.banco.modelo.Cliente;
import com.br.bytebank.banco.modelo.Conta;
import com.br.bytebank.banco.modelo.ContaCorrente;
import com.br.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        //int[] idades = new int[5]
        Object[] referencias = new Object[5];

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        ContaCorrente cc1 = new ContaCorrente(222,222);
        referencias[0] = cc1;
        System.out.println(referencias[0]);

        ContaPoupanca cc2 = new ContaPoupanca(333,333);
        referencias[1] = cc2;
        System.out.println(referencias[1]);

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast
        System.out.println(ref.getNumero());
    }
}
