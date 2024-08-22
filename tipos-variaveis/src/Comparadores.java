public class Comparadores {
    public static void main(String[] args) {
        
        String nomeUm = "Roberto";
        String nomeDois =  new String("Roberto");
        System.out.println(nomeUm.equals(nomeDois)); // forma correta de comparar um objeto com outro


        System.out.println(nomeUm == nomeDois); // forma errada de comparar um objeto com outro

        
        
        int num1 = 10;
        int num2 = 20;

        boolean simNao = num1 == num2;
        
        System.out.println(simNao);

        simNao = num1 != num2;

        System.out.println(simNao);

        simNao = num1 < num2;

        System.out.println(simNao);

        simNao = num1 > num2;

        System.out.println(simNao);
        
        ///

        //&& e || 

        if(num1 > num2 && num2 >3){
            System.out.println("Verdadeiro"); //operador E
        }

        if(num1 > num2 || num2 > 3){
            System.out.println("Segunda opção"); // operador OU
        }


    }
}
