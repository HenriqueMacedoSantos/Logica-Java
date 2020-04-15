import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double salarioJaneiro;
        double salarioFevereiro;
        double salarioMarco;
        double media;
        String avaliacao;
        
        System.out.println("Digite um nome: ");
        nome = sc.nextLine();
        System.out.println("Digite o salário de janeiro: ");
        salarioJaneiro = sc.nextDouble();
        System.out.println("Digite o salário de fevereiro: ");
        salarioFevereiro = sc.nextDouble();
        System.out.println("Digite o salário de março: ");
        salarioMarco = sc.nextDouble();
        
        media = (salarioJaneiro + salarioFevereiro + salarioMarco) / 3;
        if(media<=1300){
            avaliacao = "Salário Baixo";
        }else if(media>1300 && media<=2000){
            avaliacao = "Salário Mediano";
        }else if(media>2000 && media<=4000){
            avaliacao = "Salário Razoável";
        }else if(media>4000 && media<=6000){
            avaliacao = "Salário Bom";
        }else if(media>6000 && media<=10000){
            avaliacao = "Salário Ótimo";
        }else{
            avaliacao = "Salário Excelente";
        }
        
        System.out.println("\fRESPOSTAS");
        if(salarioJaneiro<0 || salarioFevereiro<0 || salarioMarco<0){
            System.out.println("Dados inválidos.");
        }else{
            System.out.println("Média: "+media);
            System.out.println("Avaliação: "+avaliacao);
        }
    }
}
