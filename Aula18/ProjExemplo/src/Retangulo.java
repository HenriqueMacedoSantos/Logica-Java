public class Retangulo {
    //Atributos - dados de entrada:
    public double altura;
    public double largura;
    //Métodos - cálculos - processamento: 
    public double calcularArea(){
        return this.altura * this.largura;
    }
    public String verDados(){
        return "\nAltura: "+this.altura+"\nLargura: "+this.largura;
    }
}
