import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Produto p1 = new Produto();
        
        System.out.println("Digite o nome: ");
        p1.nome = sc.nextLine();
        System.out.println("Digite a quantidade: ");
        p1.quantidade = sc.nextInt();
        System.out.println("Digite o valor do produto: ");
        p1.valorProduto = sc.nextDouble();
        
        System.out.println("\nRespostas: ");
        System.out.println("Valor Total: "+p1.multiplicar());
        System.out.println("Valor Com 8%: "+p1.juros());
    }
}
