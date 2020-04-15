import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        
        System.out.println("Digite a N1: ");
        a1.nota1 = sc.nextDouble();
        System.out.println("Digite a N2: ");
        a1.nota2 = sc.nextDouble();
        System.out.println("Digite a N3: ");
        a1.nota3 =sc.nextDouble();
        
        System.out.println("\nRespostas: ");
        System.out.println("N1: "+a1.nota1);
        System.out.println("N2: "+a1.nota2);
        System.out.println("N3: "+a1.nota3);
        System.out.println("Média: "+a1.calcularMedia());
        System.out.println("Você foi "+a1.verResposta());
    }
}