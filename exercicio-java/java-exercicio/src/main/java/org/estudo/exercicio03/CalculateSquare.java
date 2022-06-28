package org.estudo.exercicio03;

import java.util.Scanner;

public class CalculateSquare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Double number = scan.nextDouble();

        Double resultSquare = number * number;

        System.out.println("O quadrado de (" + number + ") é: " + resultSquare);

        scan.close();

    }
}
