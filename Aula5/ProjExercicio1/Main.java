
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        double valorDolar;
        double cotacaoDolar;
        double conversao;
        
        System.out.println("Digite o valor em Dólar");
        valorDolar = sc.nextDouble();
        System.out.println("Digite a Cotação do Dólar");
        cotacaoDolar = sc.nextDouble();
        
        conversao = valorDolar * cotacaoDolar;
        
        System.out.println("\fValor em Reais: "+conversao);
    }
}
