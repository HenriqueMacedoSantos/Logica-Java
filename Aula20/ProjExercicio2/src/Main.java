import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        
        System.out.println("Digite um nome: ");
        f1.nome = sc.nextLine();
        System.out.println("Digite o cargo: ");
        f1.cargo = sc.nextLine();
        
        do{
            System.out.println("Digite o salário bruto: ");
            f1.salarioBruto = sc.nextDouble();
            if(f1.salarioBruto<0){
                System.out.println("ERRO!");
            }
        }while(f1.salarioBruto<0);
        
        double salarioMinimo;
        do{
            System.out.println("Digite o salário mínimo: ");
            salarioMinimo = sc.nextDouble();
            if(salarioMinimo<=0){
                System.out.println("ERRO!");
            }
        }while(salarioMinimo<=0);
        
        System.out.println("\nRESPOSTAS:");
        System.out.println(f1);
        System.out.println("Você ganha "+Math.round(f1.calcularQuantidade(salarioMinimo))+" salários mínimos");
    }
}