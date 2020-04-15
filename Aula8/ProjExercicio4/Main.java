
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
        
        int numero;
        String resposta;
        
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        
        if(numero %2 == 0){
            resposta = "Par";
        }else{
            resposta = "Ímpar";
        }
        
        System.out.println("\f"+numero+" é "+resposta);
    }
}
