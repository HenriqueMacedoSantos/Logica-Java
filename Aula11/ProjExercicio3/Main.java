import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("\f");
        
        int numero;
        String resposta;
        
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        
        if(numero % 2 == 0 && numero > 0){
            resposta = "PAR POSITIVO.";
        }else if(numero % 2 == 0 && numero < 0){
            resposta = "PAR NEGATIVO.";
        }else if(numero % 2 != 0 && numero > 0){
            resposta = "IMPAR POSITIVO.";
        }else if(numero % 2 != 0 && numero < 0){
            resposta = "IMPAR NEGATIVO.";
        }else{
            resposta = "NULO";
        }
        
        System.out.println("\f"+numero+" é "+resposta);
    }
}
