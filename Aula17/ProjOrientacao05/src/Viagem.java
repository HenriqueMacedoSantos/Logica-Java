public class Viagem {
    public double valorCombustivel;
    public double autonomia;
    public double distancia;
    
    public double calcularTotalLitros(){
        return this.autonomia / this.distancia;
    }
    public double calcularValorGasto(){
        return calcularTotalLitros() * this.valorCombustivel;
    }
}
