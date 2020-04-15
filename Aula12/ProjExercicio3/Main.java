import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\f");
        
        int mercadoria;
        int quantidade;
        double valorPagar;
        
        System.out.println("Digite sua mercadoria: \n1- Sanduiche de Bah \n2- Pastel de Vento \n3- Suco de tamarindo \n4- Hotchê Dog");
        mercadoria = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidade = sc.nextInt();
        
        switch(mercadoria){
            case 1:
                valorPagar = quantidade * 3.20;
                break;
            case 2:
                valorPagar = quantidade * 2.80;
                break;
            case 3:
                valorPagar = quantidade * 0.90;
                break;
            case 4:
                valorPagar = quantidade * 4.50;
                break;
            default:
                valorPagar = 0;
        }
        System.out.println("\fRespostas: ");
        if(mercadoria<1 || mercadoria>4 || quantidade<0){
            System.out.println("Dados inválidos");
        }else{
            System.out.println("Valor à Pagar: "+valorPagar);
        }
    }
}
