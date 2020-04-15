import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Instanciar:
        Tabuada t1 = new Tabuada();
        //Pede e lê:
        byte menu;
        do{
            System.out.println("Escolha: "
                    + "\n1 - Digitar o nº"
                    + "\n2 - Ver n°"
                    + "\n3 - Ver tabuada"
                    + "\n0 - Sair");
            menu = sc.nextByte();
            switch(menu){
                case 1:
                    System.out.println("Digite um n°");
                    t1.setNumero(sc.nextInt());
                    break;
                case 2:
                    System.out.println(t1);
                    break;
                case 3:
                    for(int cont=0;cont<=10;cont++){
                        System.out.println(t1.getNumero()+ " X "
                        +cont+ " = "+t1.calcularTabuada(cont));
                    }
                    break;
                case 4:
                    System.out.println(t1.verFatorial());
                case 0:
                    System.out.println("TCHAU!");
                    break;
                default:
                    System.out.println("ERRO! Opção inválida.");
            }
        }while(menu!=0);
        for(int cont=0;cont<=10;cont++){
            System.out.println(t1.calcularTabuada(cont));
        }
    }
}