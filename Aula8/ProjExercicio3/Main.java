
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (27/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");

        String nome;
        double nota1;
        double nota2;
        double media;
        String resposta;
        
        System.out.println("Digite um nome: ");
        nome = sc.nextLine();
        System.out.println("Digite a N1: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a N2: ");
        nota2 = sc.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if(media >= 6){
            resposta = "APROVADO";
        }else{
            resposta = "REPROVADO";
        }
 
        System.out.println("\fO aluno foi: "+resposta);
    }
}