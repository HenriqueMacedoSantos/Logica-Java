import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora c1 = new Calculadora();
        
        do{
            System.out.println("Digite o primeiro número: ");
            c1.numero1 = sc.nextDouble();
            if(c1.numero1<0){
                System.out.println("ERRO!");
            }
        }while(c1.numero1<0);
        
        do{
            System.out.println("Digite o segundo número: ");
            c1.numero2 = sc.nextDouble();
            if(c1.numero2==0){
                System.out.println("ERRO!");
            }
        }while(c1.numero2==0);
        
        byte menu;
        do{
            System.out.println("Escolha"
                    + "\n1 - Ver Dados "
                    + "\n2 - Somar "
                    + "\n3 - Multiplicar "
                    + "\n4 - Verificar se o Primeiro Número é Par ou Ímpar "
                    + "\n5 - Verificar se o Segundo Número é Par ou Ímpar "
                    + "\n6 - Raiz Quadrada do Primeiro Número "
                    + "\n7 - Dividir"
                    + "\n8 - Vericar se número 2 é Positivo, Negativo ou Nulo "
                    + "\n9 - Somar um Valor ao Segundo Número "
                    + "\n10 - Alterar os Números "
                    + "\n0 - Sair");
            menu = sc.nextByte();
            switch(menu){
                case 1:
                    System.out.println("AGUARDE...");
                    System.out.println(c1);
                    break;
                case 2:
                    System.out.println("AGUARDE...");
                    System.out.println(c1.somar());
                    break;
                case 3:
                    System.out.println("AGUARDE...");
                    System.out.println(c1.multiplicar());
                    break;
                case 4:
                    System.out.println("AGUARDE...");
                    System.out.println(c1.parOuImpar1());
                    break;
                case 5:
                    System.out.println("AGUARDE...");
                    System.out.println(c1.parOuImpar2());
                    break;
                case 6:
                    System.out.println("AGUARDE...");
                    System.out.println(c1.raizQuadrada());
                    break;
                case 7:
                    System.out.println("AGUARDE...");
                    System.out.println(c1.dividir());
                    break;
                case 8:
                    System.out.println("AGUARDE...");
                    System.out.println(c1.calcularPNN());
                    break;
                case 9:
                    double valor;
                    System.out.println("AGUARDE...");
                    System.out.println("Digite um valor: ");
                    valor = sc.nextDouble();
                    System.out.println(c1.somaValor(valor));
                    break;
                case 10:
                    System.out.println("AGUARDE...");
                    System.out.println("Digite o Primeiro Número: ");
                    c1.numero1 = sc.nextDouble();
                    System.out.println("Digite o Segundo Número; ");
                    c1.numero2 = sc.nextDouble();
                    break;
                case 11:
                    System.out.println("AGUARDE...");
                    System.out.println("");
                case 0:
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Inválido");
            }
        }while(menu!=0);
    }
}