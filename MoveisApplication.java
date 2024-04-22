import java.util.Scanner;

public class MoveisApplication {

    public static void main(String[] args) {


    Moveis m = new Moveis();
    Scanner sc = new Scanner(System.in);
    Mesa me = new Mesa();
    Televisao tv = new Televisao();

        System.out.println("Vamos fazer o cadastro dos seus moveis(Vamos começar pela mesa)");
        System.out.println("Quantas cadeiras");
        me.setCadeiras(sc.nextInt());
        sc.nextLine();
        System.out.println("Qual a cor da mesa");
        me.setCor(sc.nextLine());
        System.out.println("Qual o preco");
        me.setPreco(sc.nextDouble());
        System.out.println("Qual a marca");
        me.setMarca(sc.nextLine());
        sc.nextLine();
        System.out.println("Quantos anos de garantia");
        me.setGarantia(sc.nextInt());

        System.out.println("\n");
        System.out.println("Agora vamos cadastrar a televisão");
        System.out.println("Qual o tamanho");
        tv.setTamanho(sc.nextInt());
        sc.nextLine();
        System.out.println("Qual a marca");
        tv.setMarca(sc.nextLine());
        System.out.println("Qual foi o preco");
        tv.setPreco(sc.nextDouble());
        sc.nextLine();
        System.out.println("Quantos anos de garantia");
        tv.setGarantia(sc.nextInt());

        System.out.println(me.getCadeiras());
        System.out.println(me.getCor());
        System.out.println(me.getPreco());
        System.out.println(me.getMarca());
        System.out.println(me.getGarantia());

        System.out.println("\n");

        System.out.println(tv.getTamanho());
        System.out.println(tv.getMarca());
        System.out.println(tv.getPreco());
        System.out.println(tv.getGarantia());

        double totalGasto = me.getPreco() + tv.getPreco();
        System.out.println("Total gasto: " + totalGasto);


    }


}
