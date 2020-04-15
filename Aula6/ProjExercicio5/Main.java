
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
        
        String aluno;
        double nota1;
        double nota2;
        int numeroFaltas;
        int numeroAulas;
        double media;
        double frequencia;
        
        System.out.println("Digite o nome do aluno");
        aluno = sc.nextLine();
        System.out.println("Digite a N1: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a N2: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite o número de aulas: ");
        numeroAulas = sc.nextInt();
        System.out.println("Digite o número de faltas: ");
        numeroFaltas = sc.nextInt();
        
        media = (nota1 + nota2) / 2;
        frequencia = ((numeroAulas - numeroFaltas) * 100) / numeroAulas;
        
        System.out.println("\fMédia: "+media);
        System.out.println("Frequência: "+frequencia+ "% ");
    }
}
