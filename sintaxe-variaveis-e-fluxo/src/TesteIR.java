public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        System.out.println("----------------------------------------------");
        System.out.println("           IMPOSTO DE RENDA (IR)");
        System.out.println("-----------------------------------------------");

        if (salario >= 1900.0 && salario <= 2800.0){

            System.out.println("O IR é de 7.5%");
            System.out.println("Deduzir na declaração o valor de R$142");

        } else if (salario >= 2800.01 && salario <= 3751.0) {

            System.out.println("O IR é de 15%");
            System.out.println("Deduzir na declaração o valor de R$350");

        } else if (salario >= 3751.01 && salario <= 4664.00){

            System.out.println("O IR é de 22.5%");
            System.out.println("Deduzir na declaração o valor de R$636");
        }
    }
}
