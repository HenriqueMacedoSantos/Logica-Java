
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
        
        String funcionario;
        int horasNoMes;
        double valorPorHora;
        double salarioBruto;
        double inss;
        double valeTransporte;
        double salarioLiquido;
        
        System.out.println("Digite seu nome: ");
        funcionario = sc.nextLine();
        System.out.println("Digite as horas trabalhadas no mês: ");
        horasNoMes = sc.nextInt();
        System.out.println("Digite o valor por hora: ");
        valorPorHora = sc.nextDouble();
        
        salarioBruto = valorPorHora * horasNoMes;
        inss = salarioBruto * 0.08;
        valeTransporte = salarioBruto * 0.06;
        salarioLiquido = salarioBruto - inss - valeTransporte;
        
        System.out.println("\fSalário Líquido: R$ "+salarioLiquido);
    }
}
