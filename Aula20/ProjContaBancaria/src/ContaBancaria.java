public class ContaBancaria {
    //Atributos:
    public int numeroConta;
    public double limite;
    public double saldo;
    //Métodos:
    @Override
    public String toString() {
        return "Nº Conta: " + numeroConta +
               "\nLimite: " + limite + 
               "\nSaldo: " + saldo;
    }
    public double verSaldo(){
        return this.saldo;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }    
}
