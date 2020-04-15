
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (21/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        int idade;
        int anoAtual;
        int anoNascimento;
        
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAtual = ler.nextInt();
        
        anoNascimento = anoAtual - idade;
        
        System.out.println("\f"+nome+ " você tem "+idade+ " anos,por tanto, nasceu em "+anoNascimento);
    }
}
