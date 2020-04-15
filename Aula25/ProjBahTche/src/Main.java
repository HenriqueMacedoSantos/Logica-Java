import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        int quantidade;
        do{
            System.out.println("Digite a quantidade: ");
            quantidade = sc.nextInt();
            if(quantidade<0){
                System.out.println("ERRO!");
            }
        }while(quantidade<0);
        double valor;
        do{
            System.out.println("Digite o valor: ");
            valor = sc.nextDouble();
            if(valor<0){
                System.out.println("ERRO!");
            }
        }while(valor<0);
        //Instanciar:
        Produto p1 = new Produto(nome, quantidade, valor);
        //Respostas:
        System.out.println(p1);
        System.out.println("Total R$: "+p1.calcularTotal());
    }
}