
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
        
        int numero;
        String resposta;
        
        System.out.print("Insira o número do mês: ");
        numero = sc.nextInt();
        
        if(numero == 1){
            resposta = "Janeiro";
        }else if(numero == 2){
            resposta = "Fevereiro";
        }else if(numero == 3){
            resposta = "Março";
        }else if(numero == 4){
            resposta = "Abril";
        }else if(numero == 5){
            resposta = "Maio";
        }else if(numero == 6){
            resposta = "Junho";
        }else if(numero == 7){
            resposta = "Julho";
        }else if(numero == 8){
            resposta = "Agosto";
        }else if(numero == 9){
            resposta = "Setembro";
        }else if(numero == 10){
            resposta = "Outubro";
        }else if(numero == 11){
            resposta = "Novembro";
        }else if(numero == 12){
            resposta = "Dezembro";
        }else{
            resposta = "Invalido";
        }
        System.out.print(numero+"\f "+resposta);
    }
}

