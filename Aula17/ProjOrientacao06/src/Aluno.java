public class Aluno {
    public double nota1;
    public double nota2;
    public double nota3;
    
    public double calcularMedia(){
        return (this.nota1 * this.nota2 * this.nota3) / 3;
    }
    public String verResposta(){
        String resposta;
        if(calcularMedia() >= 7){
            resposta = "Aprovado";
        }else{
            resposta = "Reprovado";
        }
        return resposta;
    }
}