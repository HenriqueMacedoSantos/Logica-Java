
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (22/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        double x;
        double y;
        double resultado1;
        double resultado2;
        
        System.out.println("Digite o valor x");
        x = sc.nextDouble();
        System.out.println("Digite o valor y");
        y = sc.nextDouble();
        
        resultado1 = (2+y+Math.sqrt(x)) / (2*x) + Math.pow(x,2) / Math.sqrt(y);
        resultado2 = (Math.pow(y,x) + Math.sqrt(x)) / (2*x*y);
        
        System.out.println("Resultado 1: "+resultado1);
        System.out.println("Resultado 2: "+resultado2);
    }
}
