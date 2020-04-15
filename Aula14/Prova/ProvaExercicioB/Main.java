import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        
        String nome;
        double nota1;
        double nota2;
        double nota3;
        double media;
        String resposta;
        
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        System.out.println("Digite a Primeira Nota ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a Segunda Nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a Terceira Nota: ");
        nota3 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if(media >= 9){
            resposta = "Conceito A";
        }else if(media >= 8 && media <= 8.9){
            resposta = "Conceito B";
        }else if(media >= 6 && media <= 7.9){
            resposta = "Conceito C";
        }else if(media < 6){
            resposta = "Conceito D";
        }else{
            resposta = "Inválido";
        }
         
        System.out.println("\fSua média é: "+media);
        System.out.println("Você ficou no: "+resposta);
    }
}
