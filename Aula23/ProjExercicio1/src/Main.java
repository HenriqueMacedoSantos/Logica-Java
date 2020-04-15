import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente c1 = new Cliente();
        
        System.out.println("Digite o seu saldo médio: ");
        c1.setSaldoMedio(sc.nextDouble());
        
        do{
            System.out.println("Digite o seu tempo de conta: ");
            c1.setTempoDeConta(sc.nextInt());
            if(c1.getTempoDeConta()>0 && c1.getTempoDeConta()<=2){
                System.out.println(Math.round(c1.valorCredito1()));
            }else{
                System.out.println(Math.round(c1.valorCredito2()));
            }
        }while(c1.getTempoDeConta()>0 && c1.getTempoDeConta()<=2);
    }
}