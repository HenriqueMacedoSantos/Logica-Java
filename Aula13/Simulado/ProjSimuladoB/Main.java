
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (04/06/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        double peso;
        double pesoEng;
        double pesoEma;
        
        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();
        
        pesoEng = peso * 1.15;
        pesoEma = peso * 0.80;
        
        System.out.println("Peso atual: "+peso);
        System.out.println("Peso ao engordar 15%: "+pesoEng);
        System.out.println("Peso ao emagrecer 20%: "+pesoEma);
    }
}
