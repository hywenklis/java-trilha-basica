public class Fatorial {

    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {

            int fatorial = i;

            for(int j = (fatorial-1); j>=1; j--){
                fatorial *= j;
            }

            System.out.println("Fatorial de "+ i+" = "+fatorial);
        }

        /*int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }*/

    }
}

