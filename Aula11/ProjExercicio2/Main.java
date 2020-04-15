import java.util.Scanner; 
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        int quantidade;
        int tipoCliente;
        double valorPagar;
        String cliente;
        
        System.out.println("Digite a quantidade de cópias: ");
        quantidade = sc.nextInt();
        System.out.println("Digite o tipo de cliente: \n1- Aluno \n2- Professor\n3- Diretor \n4- Não Aluno");
        tipoCliente = sc.nextInt();
        
        switch(tipoCliente){
            case 1:
                valorPagar = quantidade * 0.15;
                cliente = "Aluno";
                break;
            case 2:
                valorPagar = quantidade * 0.07;
                cliente = "Professor";
                break;
            case 3:
                valorPagar = quantidade * 0.00;
                cliente = "Diretor";
                break;
            case 4:
                valorPagar = quantidade * 0.20;
                cliente = "Não aluno";
                break;
            default:
                valorPagar = 0;
        }
        
        System.out.println("\fValor a Pagar: "+valorPagar);
    }
}
