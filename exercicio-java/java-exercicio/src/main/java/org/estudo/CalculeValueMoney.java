package org.estudo;

import java.util.Scanner;

public class CalculeValueMoney {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        Double productValue = scan.nextDouble();

        System.out.println("Digite o valor do cliente: ");
        Double valueClient = scan.nextDouble();

        double result = valueClient - productValue;

        System.out.println("Troco: " + result);

        scan.close();
    }
}
