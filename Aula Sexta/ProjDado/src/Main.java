import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        byte menu;
        do{
            System.out.println(" ♦ ♣ ♠ ♥ VAMOS JOGAR ♥ ♠ ♣ ♦ "
                    + "\n1 - Jogar "
                    + "\n0 - Sair");
            menu = sc.nextByte();
            switch(menu){
                case 1:
                    byte jogadaUsuario;
                    System.out.println("Digite o seu n° da sorte. De 1 à 6:");
                    jogadaUsuario = sc.nextByte();
                    Jogo j1 = new Jogo(jogadaUsuario);
                    System.out.println(j1);
                    if(j1.verificarSeVenceu()){
                        System.out.println("VENCEUUUUU");
                    }else{
                        System.out.println("PERDEUUUUU");
                    }
                break;
                case 0:
            }
        }while(menu!=0);
        
    }
    
}
