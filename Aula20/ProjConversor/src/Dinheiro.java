public class Dinheiro {
    //Atributos:
    public double valorReal;
    //Métodos:
    @Override
    public String toString() {
        return "\nValor Real: " + valorReal;
    }
    public double converterDolar(double cotacao){
        return this.valorReal / cotacao;
    }
}
