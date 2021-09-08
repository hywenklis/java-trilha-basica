package exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Selecao extends Controle {

    private static final List<Caminhao> caminhoes = new ArrayList<>();

    private static void adicionaCaminhao(String tipo, int quantidadePluviometro, double capacidadePluviometro) {
        caminhoes.add(new Caminhao(tipo, quantidadePluviometro, capacidadePluviometro));
    }

    private static void criarCaminhao() {
        System.out.println("Digite o tipo do caminhão (Alfa ou Beta): ");
        String tipoCaminhao = leString();
        System.out.println("Digite o Número de pluviômetro a ser transportados: ");
        int quantidadePluviometro = leInteiro();
        System.out.println("Digite a capacidade do pluviômetro a ser transportados: ");
        double capacidadePluviometro = leDouble();

        adicionaCaminhao(tipoCaminhao,quantidadePluviometro, capacidadePluviometro);
    }

    private static void listaDeCaminhoes() {
        caminhoes.forEach(System.out::println);
    }
    
    private static double caminhaMaiorCapacidade() {
        double caminhaoMaiorCapacidade = 0;
        for (Caminhao caminhao : caminhoes) {
            if(caminhao.getCargaCaminhao() > caminhaoMaiorCapacidade) {
                caminhaoMaiorCapacidade = caminhao.getCargaCaminhao();
            }
        }
        return caminhaoMaiorCapacidade;
    }

    private static void caminhaoApto() {
        for (Caminhao caminhao : caminhoes) {
            if (caminhao.getCargaCaminhao() == caminhaMaiorCapacidade()) {
                System.out.println(caminhao);
            }
        }
    }

    

    public static void menu()  {
        int opcaoSelecionada;
        do {
            System.out.println("--------------CADASTRO DE CAMINHÃO----------------- ");
            System.out.println("0. Terminar");
            System.out.println("1. Registrar Caminhão");
            System.out.println("2. Lista de Caminhões Registrados");
            System.out.println("3. Caminhão Apto");
            System.out.print("Escolha uma opção: ");
            opcaoSelecionada = leInteiro();

            System.out.println("\n");
            switch (opcaoSelecionada) {
                case 1:
                    criarCaminhao();
                    break;
                case 2: listaDeCaminhoes();
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

