
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (21/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        double valorReal;
        double cotacaoDolar;
        double cotacaoEuro;
        double conversaoDolar;
        double conversaoEuro;
        
        System.out.println("Digite o Valor em Real: ");
        valorReal = sc.nextDouble();
        System.out.println("Digite a Cotação do Dólar: ");
        cotacaoDolar = sc.nextDouble();
        System.out.println("Digite a Cotação do Euro: ");
        cotacaoEuro = sc.nextDouble();
        
        conversaoDolar = valorReal / cotacaoDolar;
        conversaoEuro = valorReal / cotacaoEuro;
        
        System.out.println("\fConversão para Dólar: "+conversaoDolar);
        System.out.println("Conversão para Euro: "+conversaoEuro);  
    }
}
