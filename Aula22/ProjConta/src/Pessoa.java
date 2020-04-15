public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private double salario;
    private int idade;
    private byte sexo;

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public byte getSexo() {
        return sexo;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {
        String textoSexo;
        switch(this.sexo){
            case 1:
                textoSexo = "Feminino";
                break;
            case 2:
                textoSexo = "Masculino";
                break;
            default:
                textoSexo = "Outros";
                break;
        }
        return "\nNome: " + nome
             + "\nCpf: " + cpf
             + "\nRg: " + rg
             + "\nSalario: " + salario 
             + "\nIdade: " + idade
             + "\nSexo: " + textoSexo;
    }
}