public class Carro {

    String marca = "Fiat";
    String modelo = "Siena";
    int anoFabricacao = 2010;
    int velocidade = 200;

    public void acelerar(){
        velocidade++;
    }
    public void frear(){
        velocidade--;
    }
    public void detalhesCarro(){
        System.out.println("O carro é da marca "+marca+" modelo "+modelo+" e ano de fabricação de "+anoFabricacao);
    }
    
}
