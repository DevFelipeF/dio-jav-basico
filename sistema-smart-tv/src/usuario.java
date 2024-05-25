public class usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual:" + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(14);

        System.out.println("Canal Atual: " + smartTv.canal);
        
        System.out.println("Tv Ligada? " + smartTv.ligado); 
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual:" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status Ligada? " + smartTv.ligado);

        smartTv.desligado();
        System.out.println("Novo Status Ligada? " + smartTv.ligado); 
    }
}
