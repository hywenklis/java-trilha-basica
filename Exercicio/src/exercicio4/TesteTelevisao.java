package exercicio4;

public class TesteTelevisao {

    public static void main(String[] args) {

        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.aumentaCanal();
        controleRemoto.aumentaCanal();
        controleRemoto.aumentaCanal();

        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();
        controleRemoto.consultaVolumeECanal();

        controleRemoto.diminuiCanal();
        controleRemoto.diminuiCanal();
        controleRemoto.consultaVolumeECanal();

        controleRemoto.mudarCanal(5);

        controleRemoto.diminuiVolume();
        controleRemoto.diminuiVolume();
        controleRemoto.aumentaVolume();
        controleRemoto.consultaVolumeECanal();
    }
}
