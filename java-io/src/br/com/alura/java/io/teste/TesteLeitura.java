package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        // Fluxo de entrada com arquivo

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bf = new BufferedReader(isr);

        String linha = bf.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = bf.readLine();
        }
        bf.close();
    }
}
