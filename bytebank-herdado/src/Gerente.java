public class Gerente extends FuncionarioAutenticavel{



    public double getBonificacao() {
        System.out.println("Bonificação do gerente");
        return super.getSalario();
    }

}
