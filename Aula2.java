public class Aula2 {
    public static void main(String[] args) {


        // Sequencia de fibonnaci ( testando os controles de fluxo)

       int a = 0;
       int b =1;

       for(int i = 0; i<10; i++){

           int prox = a +b;
           a = b;
           b = prox;
           System.out.println(prox);

       }
    }
}
