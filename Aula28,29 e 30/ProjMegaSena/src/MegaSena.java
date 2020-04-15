
import java.util.Arrays;

public class MegaSena {
    private byte[] numeroSorteados;
    private byte[] numeroApostados;
    
    public MegaSena(){
        this.numeroSorteados = new byte[6];
    }
    @Override
    public String toString() {
        return "N° Sorteados: " 
                + Arrays.toString(numeroSorteados);
    }
    public byte[] getNumeroSorteados() {
        return numeroSorteados;
    }

    public void setNumeroSorteados(byte[] numeroSorteados) {
        this.numeroSorteados = numeroSorteados;
    }
    
    public void cadastrarNumero(int indice, byte numero){
        this.numeroSorteados[indice] = numero;
    }
    public byte sortear(){
        return (byte) (Math.random()*60+1);
    }
    
    public boolean verificarSeExiste(byte numero){
        boolean achei = false;
        for(int i=0; i<this.numeroSorteados.length; i++){
            if(this.numeroSorteados[i]==numero){
                achei = true;
            }
        }
        return achei;
    }
    
    public boolean verificarSeExisteApostado(byte numero){
        boolean achei = false;
        for(int i=0; i<this.numeroApostados.length; i++){
            if(this.numeroApostados[i]==numero){
                achei = true;
            }
        }
        return achei;
    }
    public String verificarSorteio(){
        int cont = 0;
        for(int i=0; i< this.numeroSorteados.length; i++){
            for(int j=0; j< this.numeroApostados.length; j++){
                if(this.numeroSorteados==this.numeroApostados){
                    cont++;
                }
            }
        }
        return null;
    }
}
