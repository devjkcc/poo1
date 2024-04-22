public class Televisao extends Moveis {
    private int  tamanho;

    public int getTamanho(){
        return tamanho;
    }
    public void setTamanho(int tamanho){
        this.tamanho=tamanho;
    }

    public void CadastrarTv(int tamanho, double preco, String marca, int garantia){
        setTamanho(tamanho);
        setPreco(preco);
        setMarca(marca);
        setGarantia(garantia);
    }
}
