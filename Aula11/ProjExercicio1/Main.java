import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        int codigo;
        int quantidade;
        double valorPagar;
        String combustivel;
        
        System.out.println("Digite o codigo do combustivel: \n");
        System.out.println("1- GNV \n2- Etanol \n3- Gasolina Comum \n4- Gasolina Aditivada ");
        codigo = sc.nextInt();
        System.out.println("\fDigite a quantidade de litros: ");
        quantidade = sc.nextInt();
        
        switch(codigo){
            case 1:
                valorPagar = quantidade * 2.10;
                combustivel = "GNV";
                break;
            case 2:
                valorPagar = quantidade * 2.98;
                combustivel = "Etanol";
                break;
            case 3:
                valorPagar = quantidade * 4.00;
                combustivel = "Gasolina Comum";
                break;
            case 4:
                valorPagar = quantidade * 4.40;
                combustivel = "Gasolina Aditivada";
                break;
            default:
                valorPagar = 0;
                combustivel = "Inválido";
        }
        
        System.out.println("\fVocê escolheu: "+combustivel);
        System.out.println("Litros: "+quantidade);
        System.out.println("Valor a Pagar: "+valorPagar);
    }
}

