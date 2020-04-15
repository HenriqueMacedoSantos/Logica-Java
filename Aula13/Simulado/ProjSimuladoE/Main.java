import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double frequencia;
        double media;
        String resultado;
        
        System.out.println("Digite a N1: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a N2: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a Frequência: ");
        frequencia = sc.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if(media >= 6 && frequencia >=75){
            resultado = "APROVADO";
        }else{
            resultado = "REPROVADO";
        }
        
        System.out.println("\fResultado: "+resultado);
    }
}
