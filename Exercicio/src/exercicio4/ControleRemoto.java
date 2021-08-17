package exercicio4;

public class ControleRemoto implements Televisao {

    private int volume;
    private int canal;

    @Override
    public void aumentaVolume() {
        this.setVolume(getVolume() +1);
    }

    @Override
    public void diminuiVolume() {
        this.setVolume(getVolume() -1);
    }

    @Override
    public void aumentaCanal() {
        this.setCanal(getCanal() +1);
    }

    @Override
    public void diminuiCanal() {
        this.setCanal(getCanal() -1);
    }

    @Override
    public void consultaVolumeECanal() {
        System.out.println("Canal: " + getCanal() + ", volume: " + getVolume());
    }

    @Override
    public void mudarCanal(int canal) {
        this.setCanal(canal);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }


    // aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
    // aumentar e diminuir o número do canal em uma unidade
    // trocar para um canal indicado;
    // consultar o valor do volume de som e o canal selecionado
}
