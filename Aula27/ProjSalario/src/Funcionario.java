import java.util.Arrays;

public class Funcionario {
    private double[] salarios;
    //Método Construtor:
    public Funcionario(){
        this.salarios = new double[5];
    }
    //Getter e Setter:
    public double[] getSalarios() {
        return salarios;
    }
    
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
    //Método toString:
    @Override
    public String toString() {
        return "Salários: " + Arrays.toString(salarios);
    }
    //Método para cadastrar no Vetor:
    public void cadastrar(int indice, double salario){
        this.salarios[indice] = salario;
    }
    //Método para ver Primeiro salário:
    public double verPrimeiro(){
        return this.salarios[0];
    }
    //Método para ver o último salário:
    public double verUltimo(){
        return this.salarios[this.salarios.length-1];
    }
    
    //Método para calcular média:
    public double calcularMedia(){
        double acum = 0;
        for(int i=0; i<this.salarios.length; i++){
            acum += this.salarios[i];
        }
        return acum/this.salarios.length;
    }
    
    //Método para achar o maior salário:
    public double acharMaior(){
        double maior = this.salarios[0];
        for(int i=0; i<this.salarios.length; i++){
            if(this.salarios[i]>maior){
                maior = this.salarios[i];
            }
        }
        return maior;
    }
    
    //Método para encontrar o Menor:
    public double acharMenor(){
        double menor = this.salarios[0];
        for(int i=0; i<this.salarios.length; i++){
            if(this.salarios[i]<menor){
                menor = this.salarios[i];
            }
        }
        return menor;
    }
}
