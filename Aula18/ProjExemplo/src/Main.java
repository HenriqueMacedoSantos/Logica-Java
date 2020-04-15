import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Instancia a classe:
        Retangulo r1 = new Retangulo();
        //Pede e lê:
        do{
            System.out.println("Digite a largura do retângulo: ");
            r1.largura = sc.nextDouble();
            if(r1.largura<0){
                System.out.println("ERRO!");
            }
            
        }while(r1.largura<0);
        do{
            System.out.println("Digite a altura: ");
            r1.altura = sc.nextDouble();
            if(r1.altura<0){
                System.out.println("ERRO!");
            }
        }while(r1.altura<1);
        //Respostas:
        System.out.println("\nRESPOSTAS: ");
        System.out.println("Dados: "+r1.verDados());
        System.out.println("Área é: "+r1.calcularArea());
    }
}