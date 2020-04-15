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
        
        double raio;
        double area;
        double perimetro;
        
        System.out.println("Digite o Raio");
        raio = sc.nextDouble();
        
        area = Math.PI * Math.pow(raio,2);
        perimetro = 2 * Math.PI * raio;
        
        System.out.println("\fÁrea: "+area);
        System.out.println("Perímetro: "+perimetro);
    }
}
