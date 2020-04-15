public class Calculadora {
    public double numero1;
    public double numero2;

    @Override
    public String toString() {
        return "\nPrimeiro Número: " + this.numero1
             + "\nSegundo Número: " + this.numero2;
    }
    
    public double somar(){
        return this.numero1 + this.numero2;
    }
    
    public double multiplicar(){
        return this.numero1 * this.numero2;
    }
    
    public String parOuImpar1(){
        if(this.numero1%2==0){
            return "Par";
        }else{
            return "Impar";
        }
    }
    
    public String parOuImpar2(){
        if(this.numero2%2==0){
            return "Par";
        }else{
            return "Impar";
        }
    }
    
    public double raizQuadrada(){
        return Math.sqrt(this.numero1);
    }
    
    public double dividir(){
        return this.numero1 / this.numero2;
    }
    
    public String calcularPNN(){
        if(this.numero2>0){
            return "Positivo";
        }else if(this.numero2<0){
            return "Negativo";
        }else{
            return "Nulo";
        }
    }
    
    public double somaValor(double valor){
        return valor + this.numero2;
    }
}