import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversor c1 = new Conversor();
        
        System.out.println("Digite a hora: ");
        c1.hora = sc.nextInt();
        
        System.out.println("\nRespostas");
        System.out.println("Minutos: "+c1.calcularMinutos());
        System.out.println("Segundos: "+c1.calcularSegundos());
    }
}