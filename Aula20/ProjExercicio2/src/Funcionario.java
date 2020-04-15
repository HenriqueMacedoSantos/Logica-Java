public class Funcionario {
    public String nome;
    public String cargo;
    public double salarioBruto;

    @Override
    public String toString() {
        return "\nNome: " + nome
             + "\nCargo: " + cargo 
             + "\nSalario Bruto: " + salarioBruto;
    }
    
    public double calcularQuantidade(double salarioMinimo){
        return (this.salarioBruto / salarioMinimo);
    }
}