import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salario s = new Salario();
        
        System.out.println("Digite o salário: ");
        s.salario = sc.nextDouble();
        
        System.out.println("\nRESPOSTAS: ");
        System.out.println("Salário: "+s.salario);
        System.out.println("Salário(com aumento): "+s.calcularSalario());
    }   
}