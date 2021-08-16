package com.br.bytebank.banco.teste.util;

import com.br.bytebank.banco.modelo.Conta;
import com.br.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);
        Conta cc2 = new ContaCorrente(22,13);
        lista.add(cc2);
        Conta cc3 = new ContaCorrente(22,14);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(22,14);
        lista.add(cc4);

        boolean igual = cc3.equals(cc4);
        System.out.println(igual);

        boolean existe = lista.contains(cc2);
        System.out.println("Já existe? " + existe);

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
