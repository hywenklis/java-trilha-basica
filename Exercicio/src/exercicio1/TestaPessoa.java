package exercicio1;

public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Hywenklis");
        pessoa.setAltura("1.70");
        pessoa.setDataNascimento("18-10-1997");
        
        pessoa.dadosPessoa();
    }
}
