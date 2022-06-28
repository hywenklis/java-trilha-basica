package org.estudo.exercicio02;

import java.util.Scanner;

public class CalculateIMC {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        Double weight = scan.nextDouble();

        System.out.println("Digite a sua altura: ");
        Double height = scan.nextDouble();

        Double imcResult = weight / (height * height);

        System.out.println("Olá seu IMC é de: " + imcResult);

        scan.close();
    }
}
