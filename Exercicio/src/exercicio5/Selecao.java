package exercicio5;

public class Selecao extends Controle{

    public static void caminhaoApto() {
        Caminhao caminhao = new Caminhao();

        System.out.println("Digite o tipo do caminhão (Alfa ou Beta): ");
        caminhao.setTipo(leString());

        if(caminhao.getTipo().equals("fim")) return;

        System.out.println("Número de pluviômetro a ser transportados: ");
        caminhao.setQuantidadePluviometro(leInteiro());
    }
}
