public class Gerente extends Funcionario{

    private int senha = 123;


    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        }else {
            return false;
        }
    }

    public double getBonificacao() {
        System.out.println("Bonificação do gerente");
        return super.getBonificacao() + super.getSalario();
    }
}
