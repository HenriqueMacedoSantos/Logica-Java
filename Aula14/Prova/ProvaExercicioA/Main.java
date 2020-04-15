import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int rg;
        double valorHora;
        int numeroHora;
        double salarioBruto;
        double salarioComAumento;
        
        System.out.println("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.println("Digite o RG: ");
        rg = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        numeroHora = sc.nextInt();
        
        salarioBruto = numeroHora * 15;
        salarioComAumento = salarioBruto * 1.05;
        
        System.out.println("\f"+nome+" ganha R$ "+salarioBruto+" - pois trabalhou "+numeroHora+" horas este mês.");
        System.out.println("Seu salário aumentado 5% ficará R$ "+salarioComAumento);
    }
}
