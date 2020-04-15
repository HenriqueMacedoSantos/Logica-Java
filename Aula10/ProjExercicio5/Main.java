import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        double altura;
        byte sexo;
        double resposta;
        
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.println("Digite: \n1- Masculino \n2- Feminino ");
        sexo = sc.nextByte();
        
        switch(sexo){
            case 1:
                resposta = (72.7 * altura) - 58;
                break;
            case 2:
                resposta = (62.1 * altura) - 47.7;
                break;
            default:
                resposta = 0;
        }
        
        System.out.println("\fEsse é seu peso ideal: "+resposta);
    }
}
