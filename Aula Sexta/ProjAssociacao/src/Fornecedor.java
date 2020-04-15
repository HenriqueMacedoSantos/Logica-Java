public class Fornecedor {
    private String nome;
    private String cnpj;
    private Endereco endereco;
    
    public Fornecedor(){
        this.endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nCnpj: " + cnpj + 
               "\nEndereço: " + endereco;
    }
}
