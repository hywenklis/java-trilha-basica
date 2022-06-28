package org.estudo.exercicio04;

import java.util.Scanner;

public class PrintNameAndLastName {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String name = scan.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String lastName = scan.nextLine();

        System.out.printf("Olá %s %s é uma prazer ter você aqui!", name, lastName);

        scan.close();

    }
}
