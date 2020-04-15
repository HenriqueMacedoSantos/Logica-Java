import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int idade;
        String faixaEtaria;
        
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        
        if(idade <= 10){
            faixaEtaria = "Criança.";
        }else if(idade > 10 && idade <= 12){
            faixaEtaria = "Pré-Adolescente.";
        }else if(idade > 12 && idade <= 17){
            faixaEtaria = "Adolescente.";
        }else if(idade > 17 && idade <= 64){
            faixaEtaria = "Adulto.";
        }else{
            faixaEtaria = "Idoso.";
        }
        
        System.out.println("\fVocê é "+faixaEtaria);
    }
}
