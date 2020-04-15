
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (23/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;
        
        System.out.println("Digite o valor A: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor B: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor C: ");
        c = sc.nextDouble();
        
        delta = Math.pow(b,2) - 4*a*c;
        x1 = (- b + Math.sqrt(delta)) / 2*a;
        x2 = (- b - Math.sqrt(delta)) / 2*a;
        
        System.out.println("\fX1: "+x1);
        System.out.println("X2: "+x2);
    }
}
