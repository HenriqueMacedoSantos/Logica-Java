import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Instancia a classe - criar um objeto:
        Aluno a1 = new Aluno();
        //Pede e lê:
        System.out.println("Digite o nome do aluno: ");
        a1.nome = sc.nextLine();
        System.out.println("Digite a nota 1: ");
        a1.nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        a1.nota2 = sc.nextDouble();
        //Respostas:
        System.out.println("\nRESPOSTAS:");
        System.out.println("Aluno: "+a1.nome);
        System.out.println("Nota 1: "+a1.nota1);
        System.out.println("Nota 2: "+a1.nota2);
        System.out.println("Média: "+a1.calcularMedia());
    }
}
