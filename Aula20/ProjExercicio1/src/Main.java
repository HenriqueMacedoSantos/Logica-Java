
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite o nome: ");
        p1.nome = sc.nextLine();
        
        do{
            System.out.println("Digite o ano de nascimento: ");
            p1.anoNascimento = sc.nextInt();
            if(p1.anoNascimento <=0){
                System.out.println("ERRO!");
            }
        }while(p1.anoNascimento <=0);
        
        int anoAtual;
        do{
            System.out.println("Digite o ano atual: ");
            anoAtual = sc.nextInt();
            if(anoAtual < p1.anoNascimento){
                System.out.println("ERRO!");
            }
        }while(anoAtual < p1.anoNascimento);
        
        System.out.println("\nRESPOSTAS:");
        System.out.println(p1);
        System.out.println("Você vai fazer "+p1.calcularIdade(anoAtual)+" anos este ano.");
    }
}