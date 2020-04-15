
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (28/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        double numero1;
        double numero2;
        int opcao;
        double resposta;
        
        System.out.println("Digite o primeiro número: ");
        numero1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = sc.nextDouble();
        System.out.println("Digite: \n1-Somar \n2-Multiplicar \n3-Apresentar o Dobro ");
        opcao = sc.nextInt();
        
        switch(opcao){
            case 1:
                resposta = numero1 + numero2;
                break;
            case 2:
                resposta = numero1 * numero2;
                break;
            case 3: 
                resposta = numero1 * 2;
                break;
            default:
                resposta = 0;
        }
        
        System.out.println("\fPrimeiro Número: "+numero1);
        System.out.println("Segundo Número: "+numero2);
        System.out.println("Resposta: "+resposta);
    }
}