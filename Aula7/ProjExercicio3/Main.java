
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
        
        int valorSaque;
        int nota100;
        int nota50;
        int nota20;
        int nota10;
        int nota5;
        
        System.out.println("Digite o valor de saque: ");
        valorSaque = sc.nextInt();
        
        nota100 = valorSaque / 100;
        nota50 = valorSaque % 100 / 50; 
        nota20 = valorSaque % 100 % 50 / 20;
        nota10 = valorSaque % 100 % 50 % 20 / 10;
        nota5 = valorSaque % 100 % 50 % 20 % 10 / 5;
        
        System.out.println("Notas de 100: "+nota100);
        System.out.println("Notas de 50: "+nota50);
        System.out.println("Notas de 20: "+nota20);
        System.out.println("Notas de 10: "+nota10);
        System.out.println("Notas de 5: "+nota5);
    }
}
