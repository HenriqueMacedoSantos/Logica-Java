import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double nota1;
        double nota2;
        double frequencia;
        double media;
        String resultado;
        
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        System.out.println("Digite a N1: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a N2: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a frequência: ");
        frequencia = sc.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if(media >= 6 && frequencia >= 75){
            resultado = "Aprovado";
        }else{
            resultado = "Reprovado";
        }
        System.out.println("\fN1: "+nota1);
        System.out.println("N2: "+nota2);
        System.out.println("Frequência: "+frequencia+" %");
        System.out.println("Resultado: "+resultado);
    }
}
