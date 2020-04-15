public class Produto {
    public byte tipoCliente;
    public int quantidadeCopias;
    
    public double calcularTotal(){
        switch(tipoCliente){
            case 1:
                return this.quantidadeCopias * 0.15;
            case 2:
                return this.quantidadeCopias * 0.07;
            case 3:
                return this.quantidadeCopias * 0.00;
            case 4:
                return this.quantidadeCopias * 0.20;
        }
        return calcularTotal();
    }
    public String verDados(){
        return "Tipo de Cliente: "+this.quantidadeCopias+
                " Quantidade de cópias: "+this.tipoCliente;
    }
}