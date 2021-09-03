package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Controle {
    static Scanner scan = new Scanner(System.in);

    public static String leString() {
        return scan.nextLine().toLowerCase();
    }

    public static int leInteiro() {
        return scan.nextInt();
    }
}