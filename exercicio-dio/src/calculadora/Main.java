public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new CalculadoraImpl();
        System.out.println("Adição: " + calculadora.soma(5,5));
        System.out.println("Subtração: " + calculadora.subtracao(5,5));
        System.out.println("Multiplicação: " + calculadora.multiplicacao(5,5));
        System.out.println("Divisão: " + calculadora.divisao(10,5));
    }
}
