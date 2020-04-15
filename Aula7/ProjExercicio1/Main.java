
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (23/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        double salarioBase;
        double salarioReceber;
        double gratificacao;
        double imposto;
        
        System.out.println("Digite o Salário Base: ");
        salarioBase = sc.nextDouble();
        
        gratificacao = salarioBase * 0.05;
        imposto = salarioBase * 0.07;
        salarioReceber = salarioBase + gratificacao - imposto;
        
        System.out.println("\fSalário a Receber: R$ "+salarioReceber);
    }
}
