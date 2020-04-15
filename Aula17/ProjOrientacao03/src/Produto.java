public class Produto {
    
    public String nome;
    public int quantidade;
    public double valorProduto;
    
    public double multiplicar(){
        return this.quantidade * this.valorProduto;
    }
    public double juros(){
        return multiplicar() * 1.08;
    }
}
