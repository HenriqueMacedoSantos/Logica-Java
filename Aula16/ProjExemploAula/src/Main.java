import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Variáveis:
        String nome;
        double valor;
        int quantidade;
        double valorTotal;
        double valorComDesconto;
        //Pede e lê:
        System.out.println("Digite o nome do produto:");
        nome = sc.nextLine();
        System.out.println("Digite o valor do produto:");
        valor = sc.nextDouble();
        System.out.println("Digite a quantidade:");
        quantidade = sc.nextInt();
        //Cálculos:
        valorTotal = valor * quantidade;
        if(valorTotal<=99){
            valorComDesconto = valorTotal * 0.98;
        }else if(valorTotal>99 && valorTotal<=200){
            valorComDesconto = valorTotal * 0.96;
        }else if(valorTotal>200 && valorTotal<=500){
            valorComDesconto = valorTotal * 0.95;
        }else{
            valorComDesconto = valorTotal * 0.92;
        }
        //Respostas:
        System.out.println("\nRespostas");
        System.out.println("Dados");
        System.out.println("Produto: "+nome);
        System.out.println("Valor: R$ "+valor);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Cálculos:");
        System.out.println("Valor Total: R$ "+valorTotal);
        System.out.println("Valor Com Desconto: R$ "+valorComDesconto);
        }
}
