public class App {
    public static void main(String[] args) throws Exception {
        
        SmartTv smart = new SmartTv();

        System.out.println(smart.ligado);
        System.out.println(smart.volume);
        System.out.println(smart.canal);

        smart.ligar();
        System.out.println(smart.ligado);

        smart.desligar();
        System.out.println(smart.ligado);

        smart.almentarVolume();
        System.out.println(smart.volume);

        smart.diminuirVolume();
        System.out.println(smart.volume);

        smart.mudarCanal(10);

        System.out.println(smart.canal);

        
    }
}
