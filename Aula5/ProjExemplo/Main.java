
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (21/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double valorCusto;
        double valorVenda;
        int quantidade;
        double valorTotal;
        double lucroUnitario;
        double lucroTotal;
        //Atribuição - pede e lê cada dado:
        System.out.println("Digite o nome do produto: ");
        nome = ler.nextLine();
        System.out.println("Digite o valor de custo: ");
        valorCusto = ler.nextDouble();
        System.out.println("Digite o valor de venda: ");
        valorVenda = ler.nextDouble();
        System.out.println("Digite a quantidade: ");
        quantidade = ler.nextInt();
        //Cálculos
        lucroUnitario = valorVenda - valorCusto;
        valorTotal = lucroUnitario * quantidade;
        lucroTotal = valorVenda * quantidade;
        
        System.out.println("\fValor Total: "+valorTotal);
        System.out.println("Lucro Unitário: "+lucroUnitario);
        System.out.println("Lucro Total: "+lucroTotal);
    }
}
