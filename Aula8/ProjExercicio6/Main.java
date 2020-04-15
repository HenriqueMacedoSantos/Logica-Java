
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (27/05/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\f");
        
        String nome;
        double salarioHora;
        double cargaHoraria;
        double salarioMinimo;
        double salarioBruto;
        String resposta;
        
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        System.out.println("Digite o salário hora: ");
        salarioHora = sc.nextDouble();
        System.out.println("Digite a carga horária: ");
        cargaHoraria = sc.nextDouble();
        System.out.println("Digite o salário mínimo: ");
        salarioMinimo = sc.nextDouble();
        
        salarioBruto = salarioHora * cargaHoraria;
        
        if(salarioBruto == salarioMinimo){
            resposta = "um";
        }else if(salarioBruto < salarioMinimo){
            resposta = "menos de um";
        }else{
            resposta = "mais de um";
        }
        
        System.out.println(nome+ " você ganha "+resposta+ " salário mínimo");
    }
}
