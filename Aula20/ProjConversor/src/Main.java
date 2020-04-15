import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Instancia a classe:
        Dinheiro d1 = new Dinheiro();
        //Pede e lê os dados:
        do{
            System.out.println("Digite um valor em reais: ");
            d1.valorReal = sc.nextDouble();
            if(d1.valorReal<0){
                System.out.println("ERRO!");
            }
        }while(d1.valorReal<0);
        //RESPOSTAS:
        //Pede os argumentos:
        double cotacao;
        do{
            System.out.println("Digite a cotação do dólar: ");
            cotacao = sc.nextDouble();
            if(cotacao<0){
                System.out.println("ERRO!");
            }
        }while(cotacao<0);
        System.out.println("\nRESPOSTAS:");
        System.out.println("Dados: "+d1);
        System.out.println("Convertendo $ "
                +d1.converterDolar(cotacao));
    } 
}