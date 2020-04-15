public class Pessoa {
    public String nome;
    public int anoNascimento;

    @Override
    public String toString() {
        return "\nNome: " + nome
             + "\nanoNascimento: " + anoNascimento;
    }
    public int calcularIdade(int anoAtual){
        return anoAtual - this.anoNascimento;
    }
}