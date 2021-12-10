public class CalculadoraImpl implements Calculadora{
    @Override
    public int soma(int num1, int num2) {
        return num1 +num2;
    }

    @Override
    public int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divisao(double num1, double num2) {
        return num1 / num2;
    }
}
