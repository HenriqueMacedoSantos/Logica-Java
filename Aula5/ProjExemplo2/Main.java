
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
        
        String nome;
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        System.out.println("Digite seu Nome");
        nome = sc.nextLine();
        System.out.println("Digite a N1");
        nota1 = sc.nextDouble();
        System.out.println("Digite a N2");
        nota2 = sc.nextDouble();
        System.out.println("Digite a N3");
        nota3 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("\fMédia: "+media);
    }
}
