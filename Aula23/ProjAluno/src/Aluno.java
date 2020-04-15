public class Aluno {
    //Atributos:
    private String nome;
    private double nota1;
    private double nota2;
    private int faltas;
    //Métodos:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nNota1: " + nota1 + 
               "\nNota2: " + nota2 +
               "\nFaltas: " + faltas;
    }
    public double calcularMedia(){
        return (this.nota1 + this.nota2)/2;
    }
    public double calcularFrequencia(int aulas){
        return ((aulas-this.faltas)*100)/aulas;
    }
    public String retornarResultado(int aulas){
        if(calcularMedia()>=6 && calcularFrequencia(aulas)>=75){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}