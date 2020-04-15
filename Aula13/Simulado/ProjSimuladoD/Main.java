import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int anoNascimento;
        int anoAtual;
        int idade;
        int idadeFutura;
        
        System.out.println("Digite seu ano de nascimento: ");
        anoNascimento = sc.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAtual = sc.nextInt();
        
        idade = anoAtual - anoNascimento;
        idadeFutura = 2020 - anoNascimento;
        
        System.out.println("\fIdade: "+idade);
        System.out.println("Idade em 2020: "+idadeFutura);
    }
}
