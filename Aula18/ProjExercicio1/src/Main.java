import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto();
        
        System.out.println("Digite a quantidade de cópias: ");
        p1.quantidadeCopias = sc.nextInt();
        System.out.println("Digite o tipo de cliente: \n1-Aluno \n2-Professor \n3-Diretor \n4-Não Aluno");
        p1.tipoCliente = sc.nextByte();
        
        System.out.println("\nRESPOSTAS: ");
        System.out.println("Dados: "+p1.verDados());
        System.out.println("Valor a Pagar: "+p1.calcularTotal());
    }   
}
