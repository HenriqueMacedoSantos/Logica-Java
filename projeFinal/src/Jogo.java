public class Jogo {
    private int codigo;
    private String nome;
    private int quantidade;
    private double valor;
    private int quantidadeCaixa;
    private byte classificacao;
    private byte genero;
    private Data dataLancamento;    
    private Fornecedor fornecedor;

    public Jogo() {
        this.dataLancamento =new Data();
        this.fornecedor =new Fornecedor();
    }

    public void setDataLancamento(Data dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Data getDataLancamento() {
        return dataLancamento;
    }    
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeCaixa() {
        return quantidadeCaixa;
    }

    public void setQuantidadeCaixa(int quantidadeCaixa) {
        this.quantidadeCaixa = quantidadeCaixa;
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

    public void setNome(String titulo) {
        this.nome = titulo;
    }

    public byte getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(byte classificacao) {
        this.classificacao = classificacao;
    }

  
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public byte getGenero() {
        return genero;
    }

    public void setGenero(byte genero) {
        this.genero = genero;
    }
    
    public double valorCaixa(){
        return this.quantidade*this.valor;
    }

    @Override
    public String toString() {
        String op;
        String op2;
        
        switch(this.classificacao){
            case 1:
                op="Livre";
            break;
            case 2:
                op="10 anos";
            break;
            case 3:
                op="12 anos";
            break;
            case 4:
                op="14 anos";
            break;
            case 5:
                op="16 anos";
            break;
            default:
                op="18 anos";
        }
                switch(this.classificacao){
            case 1:
                op2="Ação/Aventura";
            break;
            case 2:
                op2="Luta";
            break;
            case 3:
                op2="FPS";
            break;
            case 4:
                op2="RPG";
            break;
            case 5:
                op2="Esportes";
            break;
            default:
                op2="Corrida";
        }

        return  "\n[===♥=======================♥===]" +
                "\nCodigo: " + codigo + 
                "\nNome: " + nome + 
                "\nValor do jogo: R$ "+valor+
                "\nGenero: " + op2 + 
                "\nClassificação: " + op + 
                "\nData: " + dataLancamento + 
                "\nFornecedor: " + fornecedor+
                "\nQuantidades: " +quantidade+
                "\nQuantidade de jogos por caixas: " +quantidadeCaixa+
                "\nValor da caixa: R$ " +valorCaixa ()+
                "\n[===♥=======================♥===";
    }
}
