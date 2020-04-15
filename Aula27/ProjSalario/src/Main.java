import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Instancia a classe:
        Funcionario f1 = new Funcionario();
        //Menu:
        byte menu;
        do{
            System.out.println("Escolha: "
                    + "\n1 - Cadastrar Salários"
                    + "\n2 - Ver Salários"
                    + "\n3 - Ver Primeiro Salário"
                    + "\n4 - Ver Último 1"
                    + "\n5 - Ver Média Salarial"
                    + "\n6 - Ver Maior Salário"
                    + "\n7 - Ver Menor Salário"
                    + "\n0 - Sair");
            menu = sc.nextByte();
            switch(menu){
                case 1:
                    double salario;
                    for(int i=0; i<f1.getSalarios().length; i++){
                        do{
                            System.out.println("Digite o "+(i+1)+"° salário: ");
                            salario = sc.nextDouble();
                            if(salario<0){
                                System.out.println("ERRO!");
                            }
                        }while(salario<0);
                        f1.cadastrar(i, salario);
                    }
                    break;
                case 2:
                    System.out.println(f1);
                    break;
                case 3:
                    System.out.println("Primeiro Salário R$ "
                            +f1.verPrimeiro());
                    break;
                case 4:
                    System.out.println("Último Salário R$ "
                            +f1.verUltimo());
                    break;
                case 5:
                    System.out.println("Média Salarial: "
                            +f1.calcularMedia());
                    break;
                case 6:
                    System.out.println("Maior Salário R$ "
                            +f1.acharMaior());
                    break;
                case 7:
                    System.out.println("Menor Salário R$ "
                            +f1.acharMenor());
                    break;
                case 0:
                    System.out.println("TCHAU!!!");
                    break;
                default:
                    System.out.println("ERRO! Opção inválida.");
            }
        }while(menu!=0);
    }
}
