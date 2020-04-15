import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        double valorCompra;
        double valorPagar;
        
        System.out.println("Digite um valor de compra: ");
        valorCompra = sc.nextDouble();
        
        if(valorCompra<=50){
            valorPagar = valorCompra;
        }else if(valorCompra>50 && valorCompra<=100){
            valorPagar = valorCompra * 0.98;
        }else if(valorCompra>100 && valorCompra<=200){
            valorPagar = valorCompra * 0.97;
        }else{
            valorPagar = valorCompra * 0.96;
        }
        
        System.out.println("\fRESPOSTAS");
        if(valorCompra<0){
            System.out.println("Dados inválidos");
        }else{
            System.out.println("Valor a Pagar: R$ "+valorPagar);
        }
            
    }
}
