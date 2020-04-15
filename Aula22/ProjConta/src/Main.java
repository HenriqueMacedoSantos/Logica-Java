import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        
        byte escolha;
        do{
            System.out.println("\nEscolha: "
                    + "\n1 - Digitar Dados"
                    + "\n2 - Ver Dados"
                    + "\n0 - Sair");
            escolha = sc.nextByte();
            switch(escolha){
                case 1:
                    System.out.println("INFORMANDO DADOS...");
                    do{
                        System.out.println("Digite o nome: ");
                        p1.setNome(sc.nextLine());
                        if(p1.getNome().length()<2){
                            System.out.println("ERRO!");
                        }
                    }while(p1.getNome().length()<2);
                    
                    do{
                        System.out.println("Digite o cpf: ");
                        p1.setCpf(sc.nextLine());
                        if(p1.getCpf().length()!=11){
                            System.out.println("ERRO");
                        }
                    }while(p1.getCpf().length()!=11);
                    
                    do{
                        System.out.println("Digite o rg: ");
                        p1.setRg(sc.nextLine());
                        if(p1.getRg().length()<6){
                            System.out.println("ERRO!");
                        }
                    }while(p1.getRg().length()<6);
                    
                    do{
                        System.out.println("Digite o salário: ");
                        p1.setSalario(sc.nextDouble());
                        if(p1.getSalario()<0){
                            System.out.println("ERRO!");
                        }
                    }while(p1.getSalario()<0);
                    
                    do{
                        System.out.println("Digite a idade: ");
                        p1.setIdade(sc.nextInt());
                        if(p1.getIdade()<0){
                            System.out.println("ERRO!");
                        }
                    }while(p1.getIdade()<0);
                    
                    do{
                        System.out.println("Digite o sexo\n1 - Feminino\n2 - Masculino"
                                + "\n3 - Outros");
                        p1.setSexo(sc.nextByte());
                        if(p1.getSexo()<1 || p1.getSexo()>3){
                            System.out.println("ERRO!");
                        }
                    }while(p1.getSexo()<1 || p1.getSexo()>3);
                    break;
                case 2:
                    System.out.println("VER DADOS...");
                    System.out.println(p1);
                    break;
                case 0:
                    System.out.println("Obrigado! Volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
                    }
        }while(escolha!=0);
    }
}