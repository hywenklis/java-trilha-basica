public class TesteReferencias {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("Marcos");
        gerente.setSalario(5000.00);


        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(2500.00);

        Designer designer = new Designer();
        designer.setSalario(1000.00);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente);
        controle.registra(editorVideo);
        controle.registra(designer);

        System.out.println(controle.getSoma());
    }
}
