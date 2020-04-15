import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        String cpf;
        String cargo;
        double valorHora;
        double quantidadeHoras;
        double valorPassagem;
        byte dependentes;
        byte tipoInsalubridade;
        double valorRefeicao;
        double salarioBruto;
        double valeTransporte;
        double salarioFamilia;
        double insalubridade;
        double inss;
        double salarioLiquido;
        double horasExtras50;
        double horasExtras100;
        double valeRefeicao;
        double valorExtras50;
        double valorExtras100;
        
        System.out.println("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.println("Digite o cpf: ");
        cpf = sc.nextLine();
        System.out.println("Digite o cargo: ");
        cargo = sc.nextLine();
        System.out.println("Digite o valor hora: ");
        valorHora = sc.nextDouble();
        System.out.println("Digite a quantidade de horas: ");
        quantidadeHoras = sc.nextDouble();
        System.out.println("Digite o valor da passagem: ");
        valorPassagem = sc.nextDouble();
        System.out.println("Digite a quantidade de dependentes:");
        dependentes = sc.nextByte();
        System.out.println("Digite o tipo de insalubridade: "
                +  "1 – Sem Insalubridade\n"
                +  "2 – Mínimo\n"
                +  "3 – Médio\n"
                +  "4 – Máxima"); 
        tipoInsalubridade = sc.nextByte();
        System.out.println("Digite o valor da refeição diária: ");
        valorRefeicao = sc.nextDouble();
        System.out.println("Digite as horas extras semanais: ");
        horasExtras50 = sc.nextDouble();
        System.out.println("Digite as horas extras fim de semana " + "feriados: ");
        horasExtras100 = sc.nextDouble();
        //Processamneto:
        //Cálculo Salario Bruto:
        salarioBruto = valorHora * quantidadeHoras;
        //Cálculo Salário Família:
        if(salarioBruto<=907.77){
            salarioFamilia = dependentes * 46.54;
        }else if(salarioBruto>907.78 && salarioBruto<=1364.43){
            salarioFamilia = dependentes * 32.80;
        }else{
            salarioFamilia = 0;
        }
        //Cálculo Insalubridade:
        switch (tipoInsalubridade) {
            case 1:
                insalubridade = 0;
                break;
            case 2:
                insalubridade = 980 * 0.1;
                break;
            case 3:
                insalubridade = 980 * 0.2;
                break;
            default:
                insalubridade = 980 * 0.4;
        }
        //Cálculo inss:
        if(salarioBruto<=1751.81){
            inss = salarioBruto * 0.08;
        }else if(salarioBruto>=1751.82 && salarioBruto<=2919.72){
            inss = salarioBruto * 0.09;
        }else if(salarioBruto>=2919.73 && salarioBruto<=5839.45){
            inss = salarioBruto * 0.11;
        }else{
            inss = salarioBruto * 0.27;
        }
        //Cálculo do vale transporte:
        if((salarioBruto*0.06)>valorPassagem){
            valeTransporte = valorPassagem;
        }else{
            valeTransporte = salarioBruto*0.06;
        }
        
        //Cálculo Vale Refeição:
        valeRefeicao = (20*25)*0.2;
        //Cálculo Hora Extra 50:
        valorExtras50 = (valorHora * 1.5) * horasExtras50;
        //Cálculo Hora Extra 100:
        valorExtras100 = (valorHora * 2) * horasExtras100;
        //Cálculo Salário Líquido:
        salarioLiquido = salarioBruto + salarioFamilia
                +insalubridade - valeTransporte - inss 
                - valeRefeicao + valorExtras50 + valorExtras100;
        //RESPOSTAS:
        System.out.println("\n---------RESPOSTAS---------");
        System.out.println("Dados Pessoais: ");
        System.out.println("Funcionário: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Cargo: "+cargo);
        System.out.println("Valor hora: R$ "+valorHora);
        System.out.println("Quantidade de horas: "+quantidadeHoras);
        System.out.println("Valor Passagem: R$ "+valorPassagem);
        System.out.println("Número de dependentes: "+dependentes);
        System.out.println("Insalubridade "+insalubridade);
        System.out.println("Valor Refeição diária: R$ "+valeRefeicao);
        System.out.println("Horas Extras Semanais: "+horasExtras50);
        System.out.println("Horas Extras Finais de semana: "+horasExtras100);
        System.out.println("Cálculos:");
        System.out.println("Sálario Bruto: R$ "+salarioBruto);
        System.out.println("Vale Transporte:"+valeTransporte);
        System.out.println("Salário Família: R$ "+salarioFamilia);
        System.out.println("Vale Refeição: R$ "+valeRefeicao);
        System.out.println("INSS: R$ "+inss);
        System.out.println("Insalubridade: "+insalubridade);
        System.out.println("Horas Extras 50%: R$ "+valorExtras50);
        System.out.println("Horas Extras 100%: R$ "+valorExtras100);
        System.out.println("Sálario Líquido: R$ "+salarioLiquido);
    }
}
