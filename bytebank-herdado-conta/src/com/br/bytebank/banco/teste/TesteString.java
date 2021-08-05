package com.br.bytebank.banco.teste;public class TesteString {

    public static void main(String[] args) {

        String nome = "Alura"; // Object literal

        // String outra = nome.replace("A", "a");
        String outro = nome.toLowerCase();

        System.out.println(outro);

        char c = nome.charAt(2);
        System.out.println(c);

        int pos = nome.indexOf("r");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);

        System.out.println(nome.length());

        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        String vazio = " ";
        String outroVazio = vazio.trim();
        System.out.println(outroVazio.isEmpty());
    }
}
