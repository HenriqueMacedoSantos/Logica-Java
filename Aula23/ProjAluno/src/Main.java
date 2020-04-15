import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        
        System.out.println("Digite o nome: ");
        a1.setNome(sc.nextLine());
        do{
            System.out.println("Digite a nota 1: ");
            a1.setNota1(sc.nextDouble());
            if(a1.getNota1()<0 || a1.getNota1()>10){
                System.out.println("ERRO!");
            }
        }while(a1.getNota1()<0 || a1.getNota1()>10);
        
        do{
           System.out.println("Digite a nota 2: ");
            a1.setNota2(sc.nextDouble());
            if(a1.getNota2()<0 || a1.getNota2()>10){
                System.out.println("ERRO!");
            }
        }while(a1.getNota2()<0 || a1.getNota2()>10);
        int aulas;
        
        do{
            System.out.println("Digite o nº de aulas: ");
            aulas = sc.nextInt();
            if(aulas<0){
                System.out.println("ERRO!");
            }
        }while(aulas<0);
        
        do{
            System.out.println("Digite o nº de faltas: ");
            a1.setFaltas(sc.nextInt());
            if(a1.getFaltas()<0 || a1.getFaltas()>aulas){
                System.out.println("ERRO!");
            }
        }while(a1.getFaltas()<0 || a1.getFaltas()>aulas);
        //RESPOSTAS:
        System.out.println("\nRESPOSTAS:");
        System.out.println(a1);
        System.out.printf("Média: %.2f",a1.calcularMedia());
        System.out.printf("Frequência: %.0f"
                ,a1.calcularFrequencia(aulas),"%");
        System.out.println("Resultado: "
                +a1.retornarResultado(aulas));
    }
}