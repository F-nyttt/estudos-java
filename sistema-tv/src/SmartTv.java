public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void aumentarVolume(){
        volume++;
    }

    public void mudarCanal(){
        canal++;
    }

    public void ligar(){
         ligada = true;
    }

    public void desligar(){
        ligada = false;
    }



}

