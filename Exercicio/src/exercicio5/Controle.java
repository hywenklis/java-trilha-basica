package exercicio5;

import java.util.Scanner;

public class Controle {
    static Scanner scan = new Scanner(System.in);

    public static String leString() {
        return scan.next().toLowerCase();
    }

    public static int leInteiro() {
        return scan.nextInt();
    }

    public static double leDouble() {
        return scan.nextDouble();
   }
}