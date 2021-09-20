package exercicio5;
import java.util.ArrayList;
import java.util.List;

public class Selecao extends Controle {

    private static final List<Caminhao> caminhoes = new ArrayList<>();

    private static void adicionaCaminhao(String tipoCaminhao, int quantidadePluviometro, String tipoPluviometro) {
        caminhoes.add(new Caminhao(tipoCaminhao, quantidadePluviometro, tipoPluviometro));
    }

    private static void cadastroCaminhao() {
        System.out.println("Digite o tipo do caminhão (Alfa ou Beta): ");
        String tipoCaminhao = leString();
        System.out.println("Digite a quantidade de pluviômetro a ser transportado: ");
        int quantidadePluviometro = leInteiro();
        System.out.println("Digite o tipo de pluviômetro a ser transportado (Manual ou Digital): ");
        String tipoPluviometro = leString();

        adicionaCaminhao(tipoCaminhao,quantidadePluviometro, tipoPluviometro);
    }

    private static void listaDeCaminhoesCadastrados() {
        caminhoes.forEach(System.out::println);
    }
    
    private static double caminhaoMaiorCapacidade() {
        double caminhaoMaiorCapacidade = 0;
        for (Caminhao caminhao : caminhoes) {
            if(caminhao.getCargaCaminhao() > caminhaoMaiorCapacidade) {
                caminhaoMaiorCapacidade = caminhao.getCargaCaminhao();
            }
        }
        return caminhaoMaiorCapacidade;
    }

    private static void caminhaoApto() {
        caminhoes.stream()
        .filter(caminhao -> caminhao.getCargaCaminhao() == caminhaoMaiorCapacidade())
        .forEach(System.out::println);
    }

    public static void menu()  {
        int opcaoSelecionada;
        do {
            System.out.println("--------------CADASTRO DE CAMINHÃO----------------- ");
            System.out.println("0. Terminar");
            System.out.println("1. Cadastrar Caminhão");
            System.out.println("2. Caminhões Cadastrados");
            System.out.println("3. Caminhão Apto");
            System.out.print("Escolha uma opção: ");
            opcaoSelecionada = leInteiro();

            System.out.println("\n");
            switch (opcaoSelecionada) {
                case 1:
                    cadastroCaminhao();
                    break;
                case 2: listaDeCaminhoesCadastrados();
                    break;
                case 3: caminhaoApto();
                    break;
                default:
                    break;
            }
        } while (opcaoSelecionada != 0);
        System.out.println("Sistema finalizado!");
    }
}