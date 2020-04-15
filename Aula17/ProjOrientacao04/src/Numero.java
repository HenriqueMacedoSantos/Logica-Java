public class Numero {
    public int numero;
    
    public String verResposta(){
        String resposta;
        if(this.numero % 2 == 0){
            resposta = "Par";
        }else{
            resposta = "Impar";
        }
        return resposta;
    }
}
