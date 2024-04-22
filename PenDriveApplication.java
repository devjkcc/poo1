import java.util.Scanner;

public class PenDriveApplication {

    public static void main(String[] args) {
        // Aqui será aplicado a classe PenDrive

        PenDrive p = new PenDrive();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a marca");
        p.setTexto(sc.nextLine());
        System.out.println("Digite a capacidade");
        p.setCapacidade(sc.nextInt());
        System.out.println("Digite o comprimento");
        p.setComprimento(sc.nextDouble());
        System.out.println("Digite a largura");
        p.setLargura(sc.nextDouble());
        System.out.println("Digite a profundidade");
        p.setProfundidade(sc.nextDouble());
        System.out.println("Digite o peso");
        p.setPeso(sc.nextDouble());
        System.out.println("Digite o preço");
        p.setPreco(sc.nextDouble());

        System.out.println("Marca: " + p.getTexto());
        System.out.println("Capacidade: " + p.getCapacidade());
        System.out.println("Comprimento: " + p.getComprimento());
        System.out.println("Largura: " + p.getLargura());
        System.out.println("Peso: " + p.getPeso());
        System.out.println("Preço: " + p.getPreco());

    }

}
