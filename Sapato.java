import java.util.Scanner;

public class Sapato extends Calcado {

    private boolean cadarco;
    private String modelo;

    public void setCadarco(boolean cadarco){
        this.cadarco = cadarco;

    }

    public boolean getCadarco(){
        return cadarco;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void Cadastrar(String marca, double preco, int tamanho, boolean cadarco, String modelo){
        setMarca(marca);
        setPreco(preco);
        setTamanho(tamanho);
        setCadarco(cadarco);
        setModelo(modelo);
    }

    public void entrada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a marca");
        setMarca(sc.nextLine());
        System.out.println("Digite o preco");
        setPreco(sc.nextDouble());
        System.out.println("Digite o tamanho");
        setTamanho(sc.nextInt());
        System.out.println("Tem cadarco [true/false]");
        setCadarco(sc.nextBoolean());
        System.out.println("Digite o modelo [true/false]");
        setModelo(sc.nextLine());
    }

    public void imprimir(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Preco: " + getPreco());
        System.out.println("Tamanho: "  + getTamanho());
        System.out.println("Cadarco: " +  getCadarco());
        System.out.println("Esportivo: " + getModelo());

    }

}
