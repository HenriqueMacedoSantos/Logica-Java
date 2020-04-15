import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        String nome;
        double valorMar;
        double valorAbr;
        double media;
        String resposta;
        
        System.out.println("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.println("Digite o valor das vendas de Março: ");
        valorMar = sc.nextDouble();
        System.out.println("Digite o valor das vendas de Abril: ");
        valorAbr = sc.nextDouble();
        
        media = (valorMar + valorAbr) / 2;
        
        if(media>5000){
            resposta = "EXCELENTE VENDEDOR";
        }else if(media>3500 && media<=5000){
            resposta = "MUITO BOM VENDEDOR";
        }else if(media>2000 && media<=3500){
            resposta = "BOM VENDEDOR";
        }else if(media>=1000 && media<=2000){
            resposta = "VENDEDOR ESFORÇADO";
        }else if(media<1000){
            resposta = "VENDEDOR DESMOTIVADO";
        }else{
            resposta = "DADOS INVÁLIDOS";
        }
        
        System.out.println("\fFuncionário: "+nome);
        System.out.println("Média: "+media);
        System.out.println("Classificação: "+resposta);
    }
}
