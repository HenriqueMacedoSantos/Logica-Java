public class Aluno {
    private String nome;
    private String cpf;
    private String filial;
    
    //Método Construtor:
    public Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.filial = "FL02 - Assis";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nCpf: " + cpf + 
               "\nFilial: " + filial;
    }
}