public class TestaGerente {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();

        gerente.setNome("Marcos");
        gerente.setCpf("2342342342");
        gerente.setSalario(5000.00);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        boolean autenticou = gerente.autentica(123);
        System.out.println(autenticou);

        System.out.println(gerente.getBonificacao());
    }
}
