
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (22/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        System.out.print("\f");
        
        String nomeProduto;
        double valorCusto;
        double valorComJuros;
        double valorComDesconto;
        
        System.out.println("Digite seu nome do produto: ");
        nomeProduto = ler.nextLine();
        System.out.println("Digite o valor de custo: ");
        valorCusto = ler.nextDouble();
        
        valorComJuros = valorCusto * 1.10;
        valorComDesconto = valorCusto * 0.92;
        
        System.out.println("\fO produto "+nomeProduto+ " custa R$ "+valorCusto);
        System.out.println("O mesmo com 10% de juros fica R$ "+valorComJuros);
        System.out.println("O mesmo com 8% de desconto fica R$ "+valorComDesconto);
    }
}
