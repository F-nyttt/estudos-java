public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void mudarCanal(){
        canal++;
        System.out.println("Mudando canal para: " + canal);
    }

    public void ligar(){
         ligada = true;
    }

    public void desligar(){
        ligada = false;
    }



}

