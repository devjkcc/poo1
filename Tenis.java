import java.util.Scanner;

public class Tenis extends Calcado {

    private boolean cadarco;
    private boolean esportivo;

    public void setCadarco(boolean cadarco){
        this.cadarco = cadarco;
    }

    public boolean getCardaco(){
        return cadarco;
    }

    public void setEsportivo(boolean esportivo){
        this.esportivo = esportivo;
    }

    public boolean getEsportivo(){
        return esportivo;
    }

    public void Cadastrar(String marca, double preco, int tamanho, boolean cadarco, boolean esportivo){

        setMarca(marca);
        setPreco(preco);
        setTamanho(tamanho);
        setCadarco(cadarco);
        setEsportivo(esportivo);
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
        System.out.println("é esportivo [true/false]");
        setEsportivo(sc.nextBoolean());
    }


    public void imprimir(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Preco: " + getPreco());
        System.out.println("Tamanho: "  + getTamanho());
        System.out.println("Cadarco: "+ getCardaco());
        System.out.println("Esportivo: " + getEsportivo());

    }

}
