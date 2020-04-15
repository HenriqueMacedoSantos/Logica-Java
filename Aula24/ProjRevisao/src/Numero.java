public class Numero {
    //Atributo:
    private int numero;
    
    //Métodos:
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nNumero: " + numero;
    }
    
    //Método ver se par ou impar:
    public String verSeParImpar(){
        if(this.numero%2==0){
            return "Par";
        }else{
            return "Impar";
        }
    }
    //Método para positivo, negativo ou nulo:
    public String verPositivo(){
        if(this.numero>0){
            return "Positivo";
        }else if(this.numero<0){
            return "Negativo";
        }else{
            return "Nulo";
        }
    }
    
    //Fatorial:
    public int calcularFatorial(){
        int acum = 1;
        for(int cont=this.numero; cont>=1; cont--){
            acum *= cont;
        }
        return acum;
    }
    //Somatório:
    public int calcularSomatorio(){
        int acum = 0;
        for(int cont=1; cont<=this.numero; cont++){
            acum += cont;
        }
        return acum;
    }
    //Somatório Pares:
    public int calcularSomatorioPares(){
        int acum = 0;
        for(int cont=1; cont<=this.numero; cont++){
            if(cont%2==0){
                acum += cont;
            }
        }
        return acum;
    }
    
    //Somatório Ímpares:
    public int calcularSomatorioImpares(){
        int acum = 0;
        for(int cont=1; cont<=this.numero; cont++){
            if(cont%2!=0){
                acum += cont;
            }
        }
        return acum;
    }
    
    //Contar Pares:
    public int contarPares(){
        int contPar = 0;
        for(int cont=1; cont<=this.numero; cont++){
            if(cont%2==0){
                contPar++;
            }
        }
        return contPar;
    }
    //Contar Impar:
    public int contarImpares(){
        int contImpares = 0;
        for(int cont=1; cont<=this.numero; cont++){
            if(cont%2!=0){
                contImpares++;
            }
        }
        return contImpares;
    }
    
    public boolean verSePerfeito(){
        int acum = 0;
        for(int cont=1; cont<this.numero; cont++){
            if(this.numero%cont==0){
                acum += cont;
            }
        }
        
        if(acum == this.numero){
            return true;
        }else{
            return false;
        }
    }
}