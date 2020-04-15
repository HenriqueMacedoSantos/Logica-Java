public class Cliente {
    private double saldoMedio;
    private int tempoDeConta;

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }

    public int getTempoDeConta() {
        return tempoDeConta;
    }

    public void setTempoDeConta(int tempoDeConta) {
        this.tempoDeConta = tempoDeConta;
    }
    
    public double valorCredito1(){
        if(this.saldoMedio>=0 && this.saldoMedio<=200){
            return 0;
        }else if(this.saldoMedio>=201 && this.saldoMedio<=400){
            return 20;
        }else if(this.saldoMedio>=401 && this.saldoMedio<=600){
            return 30;
        }else{
            return 40;
        }
    }
    
    public double valorCredito2(){
        if(this.saldoMedio>=0 && this.saldoMedio<=200){
            return 10;
        }else if(this.saldoMedio>=201 && this.saldoMedio<=400){
            return 25;
        }else if(this.saldoMedio>=401 && this.saldoMedio<=600){
            return 35;
        }else{
            return 45;
        }
    }
}
