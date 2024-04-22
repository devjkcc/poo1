import java.util.Scanner;

public class Mesa extends Moveis {
    private int cadeiras;
    private String cor;

    public int getCadeiras(){
        return cadeiras;
    }
    public void setCadeiras(int cadeiras){
        this.cadeiras = cadeiras;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor =  cor;
    }

    Scanner sc = new Scanner(System.in);

    public void CadastrarMesa(int cadeiras, String cor, double preco, String marca, int garantia ,Scanner sc){


        setCadeiras(cadeiras);

        setCor(cor);

        setPreco(preco);

        setMarca(marca);

        setGarantia(garantia);

    }
}
