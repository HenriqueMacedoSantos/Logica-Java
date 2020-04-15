
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (a ve)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    
    String nomeProduto;
    double valorUnitario;
    int quantidade;
    double total;
    double totalJuros;
    double totalDesconto;
    
    System.out.println("Digite o nome do produto: ");
    nomeProduto = sc.nextLine();
    System.out.println("Digite o valor unitário: ");
    valorUnitario = sc.nextDouble();
    System.out.println("Digite a quantidade: ");
    quantidade = sc.nextInt();
    
    total = valorUnitario * quantidade;
    totalJuros = valorUnitario * 1.35;
    totalDesconto = valorUnitario * 0.78;
    
    System.out.println("Total: "+total);
    System.out.println("Total com Juros: "+totalJuros);
    System.out.println("Total com Desconto: "+totalDesconto);
    }
}
