public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double valor;
    private Data dataVencimento;
    private Fornecedor fornecedor;

    public Produto() {
        this.dataVencimento = new Data();
        this.fornecedor = new Fornecedor();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Data getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Data dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return"\n---------------------------------"+
               "\nCodigo: " + codigo + 
               "\nNome: " + nome + 
               "\nQuantidade: " + quantidade + 
               "\nValor: " + valor + 
               "\nData Vencimento: " + dataVencimento + 
               "\nFornecedor: " + fornecedor;
    }
    public double calcularTotal(){
        return this.quantidade * this.valor;
    }
}
