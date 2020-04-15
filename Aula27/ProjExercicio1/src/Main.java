import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        
        byte menu;
        do{
            System.out.println("Escolha: "
                    + "\n1 - Cadastrar idade"
                    + "\n2 - Ver idades"
                    + "\n3 - Ver maior idade"
                    + "\n4 - Ver menor idade"
                    + "\n5 - Ver média de idade"
                    + "\n6 - Mostrar idades em ordem crescente"
                    + "\n0 - Sair");
            menu = sc.nextByte();
            switch(menu){
                case 1:
                    int idade;
                    for(int i=0; i<p1.getIdades().length; i++){
                        do{
                            System.out.println("Digite a "+(i+1)+"° idade: ");
                            idade = sc.nextInt();
                            if(idade<0){
                                System.out.println("ERRO!");
                            }
                        }while(idade<0);
                        p1.cadastrar(i, idade);
                    }
                    break;
                case 2:
                    System.out.println(p1);
                    break;
                case 3:
                    System.out.println("Maior Idade: "+p1.acharMaior());
                    break;
                case 4:
                    System.out.println("Menor Idade: "+p1.acharMenor());
                    break;
                case 5:
                    System.out.println("Média das idades: "+p1.calcularMedia());
                    break;
                case 6:
                    p1.ordenar();
                    System.out.println(p1);
                    break;
                case 0:
                    System.out.println("TCHAU!!!");
                    break;
                default:
                    System.out.println("ERRO! Opção inválida.");
                    break;
            }
        }while(menu!=0);
    }
}
