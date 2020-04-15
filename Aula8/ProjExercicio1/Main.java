
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
        String resposta;
        int idade;
        
        
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        
        if(idade >= 18){
            resposta = "Maior de idade";
        }else{
            resposta = "Menor de idade";
        }
            System.out.println("\fVocê é: "+resposta);
    }
}
