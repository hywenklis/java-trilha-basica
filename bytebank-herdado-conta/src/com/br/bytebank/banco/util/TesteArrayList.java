package com.br.bytebank.banco.util;

import com.br.bytebank.banco.modelo.Conta;
import com.br.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);
        Conta cc2 = new ContaCorrente(22,13);
        lista.add(cc2);
        Conta cc3= new ContaCorrente(22,16);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(22,14);
        lista.add(cc4);

        System.out.println("Tamanho: " + lista.size());

        System.out.println(lista.get(0));
        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        /*for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }*/

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
