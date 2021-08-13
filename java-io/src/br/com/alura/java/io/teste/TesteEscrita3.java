package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {
        long ini = System.currentTimeMillis();
        // Fluxo de entrada com arquivo

        PrintStream ps = new PrintStream("lorem2.txt");

        ps.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        ps.println();
        ps.println();
        ps.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        ps.close();

        long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");

    }
}
