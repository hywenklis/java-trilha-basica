public class EditorVideo extends Funcionario{

    public double getBonificacao() {
        System.out.println("Bonificação do Editor de vídeo");
        return super.getBonificacao() + 100;
    }
}
