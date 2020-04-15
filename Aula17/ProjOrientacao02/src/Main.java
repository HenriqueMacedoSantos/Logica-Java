import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Instanciamos a classe:
        Calculadora c1 = new Calculadora();
        //Pede e lê:
        System.out.println("Digite o primeiro número: ");
        c1.numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        c1.numero2 = sc.nextInt();
        //Respostas:
        System.out.println("\nRESPOSTAS: ");
        System.out.println("Número 1: "+c1.numero1);
        System.out.println("Número 2: "+c1.numero2);
        System.out.println("Soma: "+c1.somar());
        System.out.println("Multiplicação: "+c1.multiplicar());
    }
}
