package br.com.alura.java.io.teste;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        // Fluxo de entrada, saida e rede

        Socket socket = new Socket();

        InputStream fis = socket.getInputStream(); //System.in; // new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader bf = new BufferedReader(isr);

        OutputStream fos = socket.getOutputStream(); //System.out; //new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = bf.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = bf.readLine();
        }
        bf.close();
        bw.close();
    }
}
