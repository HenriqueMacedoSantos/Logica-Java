
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        byte diaNascimento;
        byte mesNascimento;
        int anoNascimento;
        byte diaAtual;
        byte mesAtual;
        int anoAtual;
        int idade;
        String signo;
        String resposta;
        
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        System.out.println("Digite o dia de nascimento: ");
        diaNascimento = sc.nextByte();
        System.out.println("Digite o mês de nascimento: ");
        mesNascimento = sc.nextByte();
        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = sc.nextInt();
        System.out.println("Digite o dia atual: ");
        diaAtual = sc.nextByte();
        System.out.println("Digite o mês atual: ");
        mesAtual = sc.nextByte();
        System.out.println("Digite o ano atual: ");
        anoAtual = sc.nextInt();
        
        //Calcular Idade;
        if(mesAtual < mesNascimento || (mesNascimento == mesAtual && diaAtual < diaNascimento)){
            idade = anoAtual - anoNascimento - 1;
        }else{
            idade = anoAtual - anoNascimento;
        }
        
        //Retornar Signo:
        if(mesNascimento == 3 && diaNascimento >= 21 && diaNascimento <= 31 || mesNascimento == 4 && diaNascimento >= 1 && diaNascimento <= 19){
            signo = "Áries.";
        }else if(mesNascimento == 4 && diaNascimento >= 20 && diaNascimento <= 30 || mesNascimento == 5 && diaNascimento >= 1 && diaNascimento <= 20){
            signo = "Touro.";
        }else if(mesNascimento == 5 && diaNascimento >= 21 && diaNascimento <= 31 || mesNascimento == 6 && diaNascimento >= 1 && diaNascimento <= 20){
            signo = "Gêmeos.";
        }else if(mesNascimento == 6 && diaNascimento >= 21 && diaNascimento <= 30 || mesNascimento == 7 && diaNascimento >= 1 && diaNascimento <= 22){
            signo = "Câncer.";
        }else if(mesNascimento == 7 && diaNascimento >= 23 && diaNascimento <= 31 || mesNascimento == 8 && diaNascimento >= 1 && diaNascimento <= 22){
            signo = "Leão.";
        }else if(mesNascimento == 8 && diaNascimento >= 23 && diaNascimento <= 31 || mesNascimento == 9 && diaNascimento >= 1 && diaNascimento <= 22){
            signo = "Virgem.";
        }else if(mesNascimento == 9 && diaNascimento >= 23 && diaNascimento <= 30 || mesNascimento == 10 && diaNascimento >= 1 && diaNascimento <= 22){
            signo = "Libra.";
        }else if(mesNascimento == 10 && diaNascimento >= 23 && diaNascimento <= 31 || mesNascimento == 11 && diaNascimento >= 1 && diaNascimento <= 21){
            signo = "Escorpião.";
        }else if(mesNascimento == 11 && diaNascimento >= 22 && diaNascimento <= 30 || mesNascimento == 12 && diaNascimento >= 1 && diaNascimento <= 20){
            signo = "Sagitário.";
        }else if(mesNascimento == 12 && diaNascimento >= 21 && diaNascimento <= 31 || mesNascimento == 1 && diaNascimento >= 1 && diaNascimento <= 19){
            signo = "Capricórnio.";
        }else if(mesNascimento == 1 && diaNascimento >= 20 && diaNascimento <= 30 || mesNascimento == 2 && diaNascimento >= 1 && diaNascimento <= 17){
            signo = "Aquário.";
        }else{
            signo = "Peixes.";
        }
        
        //Validar Signo:
        if(mesAtual < 1 || mesAtual > 12 || mesNascimento < 1 || mesNascimento > 12){
            System.out.println("\fErro! Este mês não existe.");
        }else if(anoNascimento > anoAtual){
            System.out.println("\fErro! Este ano não existe.");
        }else if(diaAtual < 1 || diaAtual > 31 || diaNascimento < 1 || diaNascimento > 31){
            System.out.println("\fErro! Este dia não existe.");        
        }else if((mesAtual == 4 || mesAtual == 6 || mesAtual == 9 || mesAtual == 11) && diaAtual == 31){
            System.out.println("\fErro! Este mês não possui 31 dias.");
        }else if((mesNascimento == 4 || mesNascimento == 6 || mesNascimento == 9 || mesNascimento == 11) && diaNascimento == 31){
            System.out.println("\fErro! Este mês não possui 31 dias.");
        }else if(diaAtual==29 && mesAtual==2 && anoAtual%4!=0){
            System.out.println("\fErro! Este ano não é bissexto.");
        }else if(diaNascimento==29 && mesNascimento==2 && anoNascimento%4!=0){
            System.out.println("\fErro! Este ano não é bissexto.");
        }else{
            System.out.println("\fRespostas: ");
            System.out.println("Nome: "+nome);
            System.out.println("Data de Nascimento: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
            System.out.println("Data Atual: "+diaAtual+"/"+mesAtual+"/"+anoAtual);
            System.out.println("Você tem "+idade+" anos.");
            System.out.println("Você é do signo de "+signo);
        }
    }
}
