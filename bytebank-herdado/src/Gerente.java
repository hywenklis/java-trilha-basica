public class Gerente extends Funcionario implements Autenticavel {

    private AutenticaUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticaUtil();
    }

    public double getBonificacao() {
        System.out.println("Bonificação do gerente");
        return super.getSalario();
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
}
