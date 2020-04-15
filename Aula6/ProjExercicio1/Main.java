
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (22/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        String nomeProduto;
        double valorCusto;
        int quantidade;
        double totalPagar;
        double totalJuros;
        double totalDesconto;
        
        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        System.out.print("Digite o valor de custo: ");
        valorCusto = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        quantidade = sc.nextInt();
        
        totalPagar = valorCusto * quantidade;
        totalJuros = valorCusto * 1.25;
        totalDesconto = valorCusto * 0.91;
        
        System.out.println("\fTotal a Pagar: "+totalPagar);
        System.out.println("Total com Juros: "+totalJuros);
        System.out.println("Total com Desconto: "+totalDesconto);
    }
}
