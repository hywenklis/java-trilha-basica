package org.estudo.exercicio05;

import java.util.Scanner;

public class ApprovedStudent {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        Double note = scan.nextDouble();

        if (note < 7) {
            System.out.println("REPROVADO!");
        } else {
            System.out.println("APROVADO!");
        }

        scan.close();
    }
}
