public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;

    }

    // volume

    public void almentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    // canal

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
