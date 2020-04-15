import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Produto p1 = new Produto();
        byte menu;
        do{
            System.out.println("\nEscolha: "
                    + "\n1 - Cadastrar Produto"
                    + "\n2 - Ver Produto"
                    + "\n3 - Ver total a Pagar"
                    + "\n4 - Editar valor do produto"
                    + "\n5 - Editar mês do vencimento"
                    + "\n6 - Editar nome do Fornecedor"
                    + "\n7 - Editar estado do Fornecedor"
                    + "\n8 - Ver Fornecedor"
                    + "\n0 - Sair");
            menu = sc.nextByte();
            switch (menu){
                case 1:
                    System.out.println("CADASTRANDO PRODUTO...");
                    System.out.println("Informando dados do Produto:");
                    System.out.println("Digite o nome: ");
                    sc.nextLine();
                    p1.setNome(sc.nextLine());
                    System.out.println("Digite a quantidade: ");
                    p1.setQuantidade(sc.nextInt());
                    System.out.println("Digite o valor: ");
                    p1.setValor(sc.nextDouble());
                    Data d1 = new Data();
                    System.out.println("Informe a data de vencimento: ");
                    System.out.println("Digite o dia: ");
                    d1.setDia(sc.nextByte());
                    System.out.println("Digite o mês: ");
                    d1.setMes(sc.nextByte());
                    System.out.println("Digite o ano: ");
                    d1.setAno(sc.nextInt());
                    //Inserir data no produto:
                    p1.setDataVencimento(d1);
                    Fornecedor f1 = new Fornecedor();
                    System.out.println("Informe os dados do fornecedor...");
                    System.out.println("Digite o nome: ");
                    sc.nextLine();
                    f1.setNome(sc.nextLine());
                    System.out.println("Digite o cnpj: ");
                    f1.setCnpj(sc.nextLine());
                    Endereco e1 = new Endereco();
                    System.out.println("Informe o endereço do fornecedor...");
                    System.out.println("Digite a cidade: ");
                    e1.setCidade(sc.nextLine());
                    System.out.println("Digite o estado: ");
                    e1.setEstado(sc.nextLine());
                    //Inserindo endereço no Fornecedor;
                    f1.setEndereco(e1);
                    //Inserindo fornecedor no produto:
                    p1.setFornecedor(f1);
                    break;
                case 2:
                    System.out.println("VISUALIZANDO PRODUTO...");
                    System.out.println(p1);
                    break;
                case 3:
                    System.out.println("TOTAL...");
                    System.out.println("R$ "+p1.calcularTotal());
                    break;
                case 4:
                    System.out.println("ALTERANDO VALOR DO PRODUTO...");
                    System.out.println("Digite o novo nome: ");
                    sc.nextLine();
                    p1.setNome(sc.nextLine());
                    break;
                case 5:
                    System.out.println("ALTERANDO MÊS DE VENCIMENTO...");
                    System.out.println("Digite o novo mês: ");
                    p1.getDataVencimento().setMes(sc.nextByte());
                    break;
                case 6:
                    System.out.println("ALTERANDO NOME DO FORNECEDOR...");
                    System.out.println("Digite o novo nome: ");
                    p1.getFornecedor().setNome(sc.nextLine());
                    break;
                case 7:
                    System.out.println("ALTERANDO ESTADO DO FORNECEDOR...");
                    System.out.println("Digite o novo estado: ");
                    p1.getFornecedor().getEndereco().setEstado(sc.nextLine());
                    break;
                case 8:
                    System.out.println(p1.getFornecedor());
            }
        }while(menu!=0);
    }
}
