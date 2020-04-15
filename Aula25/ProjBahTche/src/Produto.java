public class Produto {
    private String nome;
    private int quantidade;
    private double valor;
    private String fornecedor;

    public Produto(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.fornecedor = "Bah Tchê";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome 
             + "\nQuantidade: " + quantidade 
             + "\nValor: " + valor
             + "\nFornecedor: " + fornecedor;
    }
    public double calcularTotal(){
        return this.quantidade * this.valor;
    }
}
