public class Dado {
    private byte numero;
    
    public Dado(byte numero){
        this.numero = numero;
    }
    public byte getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "\nNumero do Dado: " + numero;
    }
}
