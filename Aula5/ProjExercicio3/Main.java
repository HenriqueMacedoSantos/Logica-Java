
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
        
        int numeroAnos;
        int numeroMeses;
        int numeroSemanas;
        int numeroDias;
        
        System.out.println("Digite sua Idade");
        numeroAnos = sc.nextInt();
        
        numeroMeses = numeroAnos * 12;
        numeroSemanas = numeroAnos * 52;
        numeroDias = numeroAnos * 365;
        
        System.out.println("\fVocê tem "+numeroAnos+" anos, "+numeroMeses+" Meses, "+numeroSemanas+" Semanas e "+numeroDias+" Dias.");
    }
}
