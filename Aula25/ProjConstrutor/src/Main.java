import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Pede e lê:
        System.out.println("Digite o nome: ");
        String nome = ler.nextLine();
        String cpf;
        do{
            System.out.println("Digite o cpf: ");
            cpf = ler.nextLine();
            if(cpf.length() !=11){
                System.out.println("ERRO!");
            }
        }while(cpf.length() !=11);
        Aluno a1 = new Aluno(nome, cpf);
        //Respostas:
        System.out.println(a1);
    }
}