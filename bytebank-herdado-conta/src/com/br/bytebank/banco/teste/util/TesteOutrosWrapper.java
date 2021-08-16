package com.br.bytebank.banco.teste.util;

public class TesteOutrosWrapper {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); // Autoboxing
        int valor = idadeRef.intValue(); // Unboxing
        System.out.println(valor);

        Double dRef = Double.valueOf(3.2);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());


    }
}
