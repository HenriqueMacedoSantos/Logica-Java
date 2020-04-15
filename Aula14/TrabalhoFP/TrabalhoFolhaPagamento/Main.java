
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        
        //Variáveis:
        String nome;
        int cpf;
        String cargo;
        double valorHora;
        int numeroHora;
        double valorPassagem;
        int quantidadeDependentes;
        byte tipoInsalubridade;
        double salarioBruto;
        double valeTransporte;
        String resposta;
        double salarioFamilia;
        double insalubridade;
        double inss;
        double beneficios;
        double descontos;
        double salarioLiquido;
        String saidaValorHora;
        String saidaNumeroHora;
        String saidaTotalPassagem;
        String saidaDependentes;
        String saidaInsalubridade;
        
        //Pede e lê:
        System.out.println("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.println("Digite o cpf: ");
        cpf = sc.nextInt();
        System.out.println("Digite o seu cargo: ");
        cargo = sc.nextLine();
        System.out.println("Digite o valor hora: ");
        valorHora = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        numeroHora = sc.nextInt();
        System.out.println("Digite o valor total da passagem ao mês: ");
        valorPassagem = sc.nextDouble();
        System.out.println("Digite a quantidade de dependentes: ");
        quantidadeDependentes = sc.nextInt();
        System.out.println("Digite o tipo de insalubridade: \n1- Nenhum \n2- Mínimo \n3- Média \n4- Máxima");
        tipoInsalubridade = sc.nextByte();
        
        //Salário Bruto:
        salarioBruto = numeroHora * valorHora;
        
        //Vale Transporte:
        valeTransporte = salarioBruto * 0.94;
        if(valeTransporte > valorPassagem){
            resposta = "A empresa paga";
        }else{
            resposta = "A empresa não paga";
        }
        
        //Salário Familia:
        if(salarioBruto <= 725.02){
            salarioFamilia = (quantidadeDependentes * 37.18) * salarioBruto;
        }else if(salarioBruto >= 725.03 && salarioBruto <= 1089.72){
            salarioFamilia = (quantidadeDependentes * 26.20) * salarioBruto;
        }else{
            salarioFamilia = 0;
        }
        
        //Insalubridade:
        switch(tipoInsalubridade){
            case 1:
                insalubridade = 980 * 0;
                break;
            case 2:
                insalubridade = 980 * 0.1;
                break;
            case 3:
                insalubridade = 980 * 0.2;
                break;
            case 4:
                insalubridade = 980 * 0.4;
                break;
            default:
                insalubridade = 0;
        }
        
        //INSS:
        if(salarioBruto <= 1751.81){
            inss = salarioBruto * 0.08;
        }else if(salarioBruto >= 1751.82 && salarioBruto <= 2919.72){
            inss = salarioBruto * 0.09;
        }else if(salarioBruto >= 2919.73 && salarioBruto <=5839.45){
            inss = salarioBruto * 0.11;
        }else if(salarioBruto > 5839.45){
            inss = salarioBruto * 0.27;
        }else{
            inss = 0;
        }
        
        //Benefícios:
        beneficios = salarioFamilia + insalubridade;
        
        //Descontos:
        descontos = inss + valeTransporte;
        
        //Salário Líquido:
        salarioLiquido = salarioBruto + beneficios - descontos;
        
        //Saída:
        System.out.println("\fValor Hora: "+valorHora);
        if(valorHora < 0){
            saidaValorHora = "Dados Inválidos";
        }
        System.out.println("Quantidade de horas trabalhadas: "+numeroHora);
        if(numeroHora < 0){
            saidaNumeroHora = "Dados Inválidos";
        }
        System.out.println("Valor total da passagem: "+valorPassagem);
        if(valorPassagem < 0){
            saidaTotalPassagem = "Dados Inválidos";
        }
        System.out.println("Quantidade de dependentes: "+quantidadeDependentes);
        if(quantidadeDependentes < 0){
            saidaDependentes = "Dados Inválidos";
        }
        System.out.println("Tipo de insalubridade: "+tipoInsalubridade);
        if(tipoInsalubridade < 1 && tipoInsalubridade > 4){
            saidaInsalubridade = "Dados Inválidos";
        }
    }
}
