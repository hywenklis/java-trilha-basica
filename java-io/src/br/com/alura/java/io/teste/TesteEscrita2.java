package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita2 {
    public static void main(String[] args) throws IOException {

        // Fluxo de entrada com arquivo

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        
        bw.write("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        bw.newLine();
        bw.newLine();
        bw.write("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        bw.close();
    }
}
