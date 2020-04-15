import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Numero n1 = new Numero();
        
        byte menu;
        do{
            System.out.print("\nEscolha: "
                    + "\n1 - Digitar um nº "
                    + "\n2 - Ver nº"
                    + "\n3 - Ver se Par ou Ímpar"
                    + "\n4 - Ver Pos, Neg ou Nulo"
                    + "\n5 - Ver Fatorial"
                    + "\n6 - Ver Somatório"
                    + "\n7 - Ver Somatório Par"
                    + "\n8 - Ver Somatório Ímpar"
                    + "\n9 - Contar Pares"
                    + "\n10 - Contar Impares"
                    + "\n11 - Ver Perfeito"
                    + "\n12 - Desenho"
                    + "\n0 - Sair");
            menu = sc.nextByte();
            switch(menu){
                case 1:
                    System.out.print("Digite o nº: ");
                    n1.setNumero(sc.nextInt());
                    break;
                case 2:
                    System.out.print(n1);
                    break;
                case 3:
                    System.out.print("O nº é: "
                    +n1.verSeParImpar());
                    break;
                case 4:
                    System.out.print("O nº é: "
                    +n1.verPositivo());
                    break;
                case 5:
                    System.out.print("Fatorial de nº: "
                    +n1.calcularFatorial());
                    break;
                case 6:
                    System.out.print("Somatório: "
                    +n1.calcularSomatorio());
                    break;
                case 7:
                    System.out.print("Somatório dos Pares: "
                    +n1.calcularSomatorioPares());
                    break;
                case 8:
                    System.out.print("Somatório dos Ímpares: "
                    +n1.calcularSomatorioImpares());
                    break;
                case 9:
                    System.out.print("Contar Pares: "
                    +n1.contarPares());
                    break;
                case 10:
                    System.out.print("Contar Ímpares: "
                    +n1.contarImpares());
                    break;
                case 11:
                    if(n1.verSePerfeito()){
                        System.out.print("Nº é perfeito");
                    }else{
                        System.out.print("Nº não é perfeito");
                    }
                    break;
                case 12:
                    System.out.print("      ___           ___           ___           ___           ___     \n" +
"     /\\  \\         /\\  \\         /\\__\\         /\\  \\         /\\__\\    \n" +
"     \\:\\  \\       /::\\  \\       /:/  /        /::\\  \\       /:/  /    \n" +
"      \\:\\  \\     /:/\\:\\  \\     /:/__/        /:/\\:\\  \\     /:/  /     \n" +
"      /::\\  \\   /:/  \\:\\  \\   /::\\  \\ ___   /::\\~\\:\\  \\   /:/  /  ___ \n" +
"     /:/\\:\\__\\ /:/__/ \\:\\__\\ /:/\\:\\  /\\__\\ /:/\\:\\ \\:\\__\\ /:/__/  /\\__\\\n" +
"    /:/  \\/__/ \\:\\  \\  \\/__/ \\/__\\:\\/:/  / \\/__\\:\\/:/  / \\:\\  \\ /:/  /\n" +
"   /:/  /       \\:\\  \\            \\::/  /       \\::/  /   \\:\\  /:/  / \n" +
"   \\/__/         \\:\\  \\           /:/  /        /:/  /     \\:\\/:/  /  \n" +
"                  \\:\\__\\         /:/  /        /:/  /       \\::/  /   \n" +
"                   \\/__/         \\/__/         \\/__/         \\/__/    ");
                default:
                    System.out.print("Tchau");
                    break;
            }
        }while(menu!=0);
    }
}