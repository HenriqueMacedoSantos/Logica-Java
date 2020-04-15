import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        MegaSena m1 = new MegaSena();
        
        byte numero;
        for(int i=0; i<m1.getNumeroSorteados().length; i++){
            do{
                numero = m1.sortear();
                if(m1.verificarSeExiste(numero)){
                    System.out.println("N° existe - "
                            + "sortearei novamente. ");
                }
            }while(m1.verificarSeExiste(numero));
            m1.cadastrarNumero(i, numero);
        }
        System.out.println("\n\nSUPER MEGASENA: ");
        System.out.println(m1);
    }
}
