import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        int latas;
        int garrafinhas;
        int garrafas;
        int quantidadeLitro;
        double valorPagar;
        
        System.out.println("Digite a quantidade de latas (350 ml): ");
        latas = sc.nextInt();
        System.out.println("Digite a quantidade de garrafinhas (600 ml): ");
        garrafinhas = sc.nextInt();
        System.out.println("Digite a quantidade de garrafas (2 Litros): ");
        garrafas = sc.nextInt();
        
        quantidadeLitro = latas + garrafinhas + garrafas;
        
        if(latas == 2.80){
        }else if(garrafinhas == 3.60){
        }else if(garrafas == 6.50){
        }
        
    }
}
