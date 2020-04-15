
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
      
      double altura;
      double base;
      double area;
      
      System.out.println("Digite a Altura");
      altura = sc.nextDouble();
      System.out.println("Digite a Base");
      base = sc.nextDouble();
      
      area = altura * base;
      
      System.out.println("\fResultado: "+area);
    }
}
