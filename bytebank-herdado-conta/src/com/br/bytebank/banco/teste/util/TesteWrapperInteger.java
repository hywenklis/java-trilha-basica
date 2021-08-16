package com.br.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        int idade = 29;

        Integer idadeRef = Integer.valueOf(29); // Autoboxing
        int valor = idadeRef.intValue(); // Unboxing

        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);

        String s = args[0];
        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);


        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); // Autoboxing


    }
}
