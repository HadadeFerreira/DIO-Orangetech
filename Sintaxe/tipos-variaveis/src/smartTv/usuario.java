package smartTv;

public class usuario {
    public static void main(String[] args) throws Exception {

    SmartTv smartTv = new SmartTv();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    System.out.println("Qual o volume ? " + smartTv.volume);

    System.out.println("Qual o canal ? " + smartTv.canal);
    
    smartTv.mudarDeCanal(25);
    System.out.println("Qual o canal ? " + smartTv.canal);


    System.out.println("Tv ligada ? " + smartTv.ligada);
    System.out.println("Qual o canal ? " + smartTv.canal);
    System.out.println("Qual o volume ? " + smartTv.volume);

    smartTv.ligar();
    System.out.println("novo metodo --> Tv ligada ? " + smartTv.ligada);

    smartTv.desligar();
    System.out.println("novo metodo --> Tv ligada ? " + smartTv.ligada);
}

}
