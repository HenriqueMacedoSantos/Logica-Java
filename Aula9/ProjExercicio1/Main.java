
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (29/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        int numero1;
        int numero2;
        int numero3;
        double resposta;
        
        System.out.println("Digite o primeiro número: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = sc.nextInt();
        System.out.println("Digite: \n1-Somar \n2-Multiplicar \n3-Subtrair \n4-Apresentar o Dobro \n5-Apresentar o Quadrado");
        numero3 = sc.nextInt();
        
        if(numero3 == 1){
            resposta = numero1 + numero2;
        }else if(numero3 == 2){
            resposta = numero1 * numero2;
        }else if(numero3 == 3){
            resposta = numero1 - numero2;
        }else if(numero3 == 4){
            resposta = numero1 * 2;
        }else if(numero3 == 5){
            resposta = numero2 * numero2;
        }else{
            resposta = 0;
        }
        
        System.out.println("\fNúmero 1: "+numero1);
        System.out.println("Número 2: "+numero2);
        System.out.println("Resposta: "+resposta);
    }
}
