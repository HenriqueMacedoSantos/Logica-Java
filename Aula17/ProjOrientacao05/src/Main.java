import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Viagem v1 = new Viagem();
        
        System.out.println("Digite o preço da gasolina: ");
        v1.valorCombustivel = sc.nextDouble();
        System.out.println("Digite a qtd. de quilometros rodados: ");
        v1.autonomia = sc.nextDouble();
        System.out.println("Digite a distância:");
        v1.distancia = sc.nextDouble();
        
        System.out.println("\nRESPOSTAS: ");
        System.out.println("Litros Necessários: "+v1.calcularTotalLitros());
        System.out.println("Valor Gasto: R$ "+v1.calcularValorGasto());
    }
}
