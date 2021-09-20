package exercicio6;

public class Selecao extends Controle {

    public static void selecaoCaminhaoApto() {

        Caminhao caminhaoApto = new Caminhao();

        while (true) {
            System.out.println("Digite o tipo do seu caminhão (Alfa ou Beta):");
            Caminhao caminhao = new Caminhao();
            caminhao.getTipo(leString());

            if (caminhao.getTipo().equals("fim")) {
                break;
            }

            System.out.println("Quantidade de pluviômetros a ser transportados:");
            caminhao.getQuantidadePluviometro(leInteiro());

            for (int i = 0; i < caminhao.getQuantidadePluviometro(); i++) {
                System.out.println("Capacidade do pluviometro:");
                Pluviometro pluviometro = new Pluviometro();
                pluviometro.getCapacidade(leDouble());
                caminhao.adicionaPluviometro(pluviometro);
            }

            if (caminhao.getCargaAtual() > caminhaoApto.getCargaAtual()) {
                caminhaoApto = caminhao;
            }
        }

        System.out.println("Caminhão apto é do tipo: " + caminhaoApto.getTipo() + ", com capacidade de: " + caminhaoApto.getCargaAtual());
    }


}
