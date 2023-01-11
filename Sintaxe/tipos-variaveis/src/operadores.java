public class operadores {
    public static void main(String[] args) {
       
        int numeroUm = 1;
        int numeroDois = 2;

        boolean simNao = numeroUm == numeroDois;

        if (numeroUm < numeroDois){
            System.out.println("A nossa condição é verdadeira");
        } 
        System.out.println("numero um é igual numero 2?" + simNao);

        simNao = numeroUm != numeroDois;
        System.out.println("numero um é diferente do numero 2?" + simNao);

        simNao = numeroUm < numeroDois;
        System.out.println("numero um é menor que o numero 2?" + simNao);
    }
}
