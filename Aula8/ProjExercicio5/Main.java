
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
        
        if(numero > 0){
            resposta = "Positivo";
        }else if(numero < 0){
            resposta = "Negativo";
        }else{
            resposta = "Nulo";
        }
        
        System.out.println("\fEsse número é: "+resposta);
    }
}
