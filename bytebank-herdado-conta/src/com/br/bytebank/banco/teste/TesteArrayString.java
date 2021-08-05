package com.br.bytebank.banco.teste;

import com.br.bytebank.banco.modelo.Cliente;
import com.br.bytebank.banco.modelo.ContaCorrente;
import com.br.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayString {

    public static void main(String[] args) {

        System.out.println("Funcionou!");

        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
