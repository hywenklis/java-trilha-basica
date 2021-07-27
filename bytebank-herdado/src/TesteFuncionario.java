public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Gerente();

        funcionario.setNome("Hywenklis Rherbert");
        funcionario.setCpf("222.222.222-22");
        funcionario.setSalario(2600.00);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());
    }
}
