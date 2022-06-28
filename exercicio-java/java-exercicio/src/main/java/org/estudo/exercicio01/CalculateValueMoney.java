package org.estudo.exercicio01;

import java.util.Scanner;

public class CalculateValueMoney {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        Double productValue = scan.nextDouble();

        System.out.println("Digite o valor do cliente: ");
        Double valueClient = scan.nextDouble();

        scan.close();
    }
}
