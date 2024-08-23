public class App {
    public static void main(String[] args) throws Exception {
        Carro siena = new Carro();

        System.out.println(siena.anoFabricacao);
        System.out.println(siena.marca);
        System.out.println(siena.modelo);

        siena.acelerar();

        System.out.println(siena.velocidade);

        siena.frear();

        System.out.println(siena.velocidade);

        siena.detalhesCarro();
    }
}
