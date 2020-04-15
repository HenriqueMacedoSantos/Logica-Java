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
        double peso1;
        double peso2;
        double peso3;
        double media;
        
        System.out.println("Digite a N1");
        nota1 = sc.nextDouble();
        System.out.println("Digite a N2");
        nota2 = sc.nextDouble();
        System.out.println("Digite a N3");
        nota3 = sc.nextDouble();
        System.out.println("Digite o Peso 1");
        peso1 = sc.nextDouble();
        System.out.println("Digite o Peso 2");
        peso2 = sc.nextDouble();
        System.out.println("Digite o Peso 3");
        peso3 = sc.nextDouble();
        
        media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / peso1 + peso2 + peso3;
        
        System.out.println("\fMédia Ponderada: "+media);
    }
}
