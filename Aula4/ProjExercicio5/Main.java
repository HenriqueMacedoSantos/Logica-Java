
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (20/05/2019)
 */
public class Main{
    public static void main(String []args){
        double valor1;
        double valor2;
        double soma;
        double diferenca;
        double produto;
        double quociente;
        double media;
        
        valor1 = 20;
        valor2 = 6;
        soma = valor1 + valor2;
        diferenca = valor1 - valor2;
        produto = valor1 * valor2;
        quociente = valor1 / valor2;
        media = (valor1 + valor2) / 2;
        
        System.out.println("\fSoma: "+soma);
        System.out.println("Diferença: "+diferenca);
        System.out.println("Produto: "+produto);
        System.out.println("Quociente: "+quociente);
        System.out.println("Média: "+media);
    }
}
