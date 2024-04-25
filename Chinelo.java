import java.util.Scanner;

public class Chinelo extends Calcado {
    private boolean  acessorio;
    private boolean tiras;

    public void setAcessorio(boolean acessorio){
        this.acessorio = acessorio;
    }

    public boolean getAcessorio(){
        return acessorio;
    }

    public void setTiras(boolean tiras){
        this.tiras = tiras;
    }

    public boolean getTiras(){
        return tiras;
    }

    public Chinelo(){
        super();
    }

    public Chinelo(String marca, double preco, int tamanho, boolean acessorio, boolean tiras){
        super();
        this.setMarca(marca);
        this.setPreco(preco);
        this.setTamanho(tamanho);
        this.setAcessorio(acessorio);
        this.setTiras(tiras);
    }

    public void Cadastrar(String marca, double preco, int tamanho, boolean acessorio, boolean tiras){
        setMarca(marca);
        setPreco(preco);
        setTamanho(tamanho);
        setAcessorio(acessorio);
        setTiras(tiras);
    }

    public void entrada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a marca");
        setMarca(sc.nextLine());
        System.out.println("Digite o preco");
        setPreco(sc.nextDouble());
        System.out.println("Digite o tamanho");
        setTamanho(sc.nextInt());
        System.out.println("Tem acessorio [true/false]");
        setAcessorio(sc.nextBoolean());
        System.out.println("Tem tiras [true/false]");
        setTiras(sc.nextBoolean());
    }

    public void imprimir(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Preco: " + getPreco());
        System.out.println("Tamanho: "  + getTamanho());
        System.out.println("Acessorio: "+ getAcessorio());
        System.out.println("Tiras: " + getTiras());

    }

}
