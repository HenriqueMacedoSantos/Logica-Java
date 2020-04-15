import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Instancia a classe:
        ContaBancaria c1 = new ContaBancaria();
        //Pede e lê:
        System.out.println("Digite o nº conta: ");
        c1.numeroConta = sc.nextInt();
        do{
            System.out.println("Digite o limite: ");
            c1.limite = sc.nextDouble();
            if(c1.limite<=0){
                System.out.println("ERRO!");
            }
        }while(c1.limite<=0);
        
        do{
            System.out.println("Digite o saldo: ");
            c1.saldo = sc.nextDouble();
            if(c1.saldo<=0){
                System.out.println("ERRO!");
            }
        }while(c1.saldo<=0);
        //Variável para menu:
        byte menu;
        do{
            System.out.println("Escolha"
                    + "\n1 - Ver Saldo "
                    + "\n2 - Depositar "
                    + "\n3 - Sacar "
                    + "\n0 - Sair");
            menu = sc.nextByte();
            switch(menu){
                case 1:
                    System.out.println("\nVISUALIZANDO SALDO...");
                    System.out.println(c1.verSaldo());
                    break;
                case 2:
                    System.out.println("\nDEPOSITANDO...");
                    double dinheiro;
                    do{
                        System.out.println("Digite o valor para depósito: ");
                        dinheiro = sc.nextDouble();
                        if(dinheiro<=0){
                            System.out.println("ERRO!");
                        }
                    }while(dinheiro<=0);
                    c1.depositar(dinheiro);
                    System.out.println("Depósito efetuado com SUCESSO!");
                    break;
                case 3:
                        System.out.println("\nSACANDO...");
                        do{
                            System.out.println("Digite o valor para sacar: ");
                            dinheiro = sc.nextDouble();
                            if(dinheiro<=0){
                                System.out.println("ERRO!");
                            }
                        }while(dinheiro<=0);
                        c1.sacar(dinheiro);
                        System.out.println("Saque efetuado com SUCESSO!");
                        break;
                case 0:
                    System.out.println("Tem certeza que deseja sair?"
                            + "\n1 - Continuar "
                            + "\n0 - Sair");
                    menu = sc.nextByte();
                    switch(menu){
                        case 1:
                            System.out.println("LEGAL - Visualize seu saldo.");
                            break;
                        case 0:
                            System.out.println("TCHAU!");
                            break;
                        default:
                            System.out.println("ERRO!");
                    }
                    break;
                default:
            System.out.println("ERRO! Opção inválida.");
            }
        }while(menu!=0);
    }    
}