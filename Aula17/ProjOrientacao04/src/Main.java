import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numero n1 = new Numero();
        
        System.out.println("Digite um número: ");
        n1.numero = sc.nextInt();
        
        System.out.println("\nRespostas: ");
        System.out.println("Numero: "+n1.numero);
        System.out.println("Seu número é "+n1.verResposta());
    }
}
