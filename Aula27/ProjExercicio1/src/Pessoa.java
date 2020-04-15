import java.util.Arrays;
public class Pessoa {
    private int[] idades;
    
    public Pessoa(){
        this.idades = new int[10];
    }

    public int[] getIdades() {
        return idades;
    }

    public void setIdades(int[] idades) {
        this.idades = idades;
    }

    @Override
    public String toString() {
        return "\nIdades: " + Arrays.toString(this.idades);
    }
    
    public void cadastrar(int indice, int idade){
        this.idades[indice] = idade;
    }
    
    public int acharMaior(){
        int maior = this.idades[0];
        for(int i=0; i<this.idades.length; i++){
            if(this.idades[i]>maior){
                maior = this.idades[i];
            }
        }
        return maior;
    }
    
    public int acharMenor(){
        int menor = this.idades[0];
        for(int i=0; i<this.idades.length; i++){
            if(this.idades[i]<menor){
                menor = this.idades[i];
            }
        }
        return menor;
    }
    
    public double calcularMedia(){
        double acum = 0;
        for(int i=0; i<this.idades.length; i++){
            acum += this.idades[i];
        }
        return acum/this.idades.length;
    }
    
    public void ordenar(){
        Arrays.sort(this.idades);
    }
}
