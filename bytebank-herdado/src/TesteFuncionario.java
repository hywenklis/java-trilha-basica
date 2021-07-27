public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente herbert = new Gerente();

        herbert.setNome("Hywenklis Rherbert");
        herbert.setCpf("222.222.222-22");
        herbert.setSalario(2600.00);

        System.out.println(herbert.getNome());
        System.out.println(herbert.getBonificacao());
    }
}
