package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeituraEEscrita {
    public static void main(String[] args) throws IOException {




        OutputStream outputStream = new FileOutputStream("lorem3.txt");
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(outputStream));

        bfw.write("Digitado....");
        bfw.newLine();
        InputStream inputStream = new FileInputStream("lorem2.txt");
        BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));


        String linha = bf.readLine();
        while (linha != null) {
            bfw.write(linha);
            bfw.newLine();
            linha = bf.readLine();
        }
        bf.close();
        bfw.close();
    }
}
