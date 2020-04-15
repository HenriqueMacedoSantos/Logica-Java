import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro c1 = new Cadastro();
        //Menu:
        byte menu;
        do{
            System.out.println("\nEscolha: "
                    + "\n 1 - Cadastrar Produto"
                    + "\n 2 - Ver Produtos Cadastrados"
                    + "\n 3 - Ver Quantidade de cadastros"
                    + "\n 4 - Excluir Produto"
                    + "\n 5 - Editar Produto"
                    + "\n 6 - Pesquisar por Código"
                    + "\n 7 - Pesquisar Produtos de um fornecedor"
                    + "\n 8 - Pesquisar Produtos por valor"
                    + "\n 9 - Pesquisar Fornecedor de um Produto"
                    + "\n10 - Pesquisar Telefone de um Fornecedor"
                    + "\n 0 - Sair");
            menu = sc.nextByte();
            switch(menu){
                case 1:
                    System.out.println("CADASTRANDO...");
                    Produto p1 = new Produto();
                    int codigo;
                    if(c1.getLista().isEmpty()){
                        codigo = 1;
                    }else{
                        codigo = c1.getLista().get(c1.getLista().size()-1).getCodigo()+1;
                    }
                    p1.setCodigo(codigo);
                    do{
                        System.out.println("Digite o nome do produto: ");
                        sc.nextLine();
                        p1.setNome(sc.nextLine());
                        if(p1.getNome().length()<2){
                            System.out.println("ERRO! Digite corretamente.");
                        }
                    }while(p1.getNome().length()<2);
                    
                    do{
                        System.out.println("Digite a quantidade: ");
                        p1.setQuantidade(sc.nextInt());
                        if(p1.getQuantidade()<=0){
                            System.out.println("ERRO! Digite corretamente.");
                        }
                    }while(p1.getQuantidade()<=0);
                    do{
                        System.out.println("Digite o valor: ");
                        p1.setValor(sc.nextDouble());
                        if(p1.getValor()<0){
                            System.out.println("ERRO! Digite corretamente.");
                        }
                    }while(p1.getValor()<0);
                    //Pedindo a data de vencimento do produto:
                    Data d1 = new Data();
                    System.out.println("Informe a data de vencimento:");
                    System.out.println("Digite o dia: ");
                    d1.setDia(sc.nextByte());
                    System.out.println("Digite o mês: ");
                    d1.setMes(sc.nextByte());
                    System.out.println("Digite o ano: ");
                    d1.setAno(sc.nextInt());
                    //Inserindo data no produto:
                    p1.setDataVencimento(d1);
                    //Pedindo Fornecedor do produto:
                    Fornecedor f1 = new Fornecedor();
                    System.out.println("Informe os dados do fornecedor:");
                    System.out.println("Digite o nome do fornecedor: ");
                    sc.nextLine();
                    f1.setNome(sc.nextLine());
                    System.out.println("Digite o cnpj: ");
                    f1.setCnpj(sc.nextLine());
                    System.out.println("Digite o telefone: ");
                    f1.setTelefone(sc.nextLine());
                    //Pedindo endereço do fornecedor:
                    Endereco e1 = new Endereco();
                    System.out.println("Informe o endereço do fornecedor:");
                    System.out.println("Digite a cidade: ");
                    e1.setCidade(sc.nextLine());
                    System.out.println("Digite o estado: ");
                    e1.setEstado(sc.nextLine());
                    //Inserindo endereço no fornecedor:
                    f1.setEndereco(e1);
                    //Inserindo fornecedor no produto:
                    p1.setFornecedor(f1);
                    //Cadastrar produto:
                    c1.cadastrar(p1);
                    
                    break;
                case 2:
                    System.out.println("VISUALIZANDO PRODUTOS...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos cadastrados.");
                    }else{
                        System.out.println(c1);
                    }
                    break;
                case 3:
                    System.out.println("QUANTIDADE PRODUTOS...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos cadastrados");
                    }else if(c1.verQuantidade()==1){
                        System.out.println("Existe um produto cadastrado.");
                    }else{
                        System.out.println("Existem "+c1.verQuantidade()+
                                " produtos");
                    }
                    break;
                case 4:
                    System.out.println("EXCLUIR PRODUTO...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos cadastrados.");
                    }else{
                        System.out.println("Digite o código: ");
                        codigo = sc.nextInt();
                        Produto encontrado = c1.pesquisarPorCodigo(codigo);
                        if(encontrado==null){
                            System.out.println("Não há este produto.");
                        }else{
                            byte confirma;
                            System.out.println("Tem Certeza que deseja excluir: "
                                    +encontrado.getNome()+"?");
                            confirma = sc.nextByte();
                            switch(confirma){
                                case 1:
                                    c1.remover(encontrado);
                                    System.out.println("Removido com SUCESSO.");
                                    break;
                                case 2:
                                    System.out.println("Operação Cancelada.");
                                    break;
                                default:
                                    System.out.println("ERRO! Opção inválida.");
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("EDITAR PRODUTO...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos. ");
                    }else{
                        System.out.println("Digite o código do produto que"
                                + "deseja editar:");
                        codigo = sc.nextInt();
                        int indiceEncontrado = c1.pesquisaIndice(codigo);
                        if(indiceEncontrado==-1){
                            System.out.println("Não há produto com este código.");
                        }else{
                            byte escolha;
                            System.out.println("O que deseja editar?"
                                    + "\n1 - Nome do Produto"
                                    + "\n2 - Nome do Fornecedor"
                                    + "\n3 - Ano de vencimento"
                                    + "\n4 - Estado do Fornecedor"
                                    + "\n0 - Cancelar edição");
                            escolha = sc.nextByte();
                            switch(escolha){
                                case 1:
                                    System.out.println("Digite o novo nome para "
                                            + "o produto "
                                      +c1.getLista().get(indiceEncontrado).getNome());
                                    sc.nextLine();
                                    c1.getLista().get(indiceEncontrado).setNome(sc.nextLine());
                                    System.out.println("Nome editado com SUCESSO.");
                                    break;
                                case 2:
                                    String nome;
                                    do{
                                        System.out.println("Digite o novo nome para o fornecedor: ");
                                        sc.nextLine();
                                        nome = sc.nextLine();
                                        if(nome.length()<2){
                                            System.out.println("ERRO!");
                                        }
                                    }while(nome.length()<2);
                                    c1.getLista().get(indiceEncontrado).
                                            getFornecedor().setNome(nome);
                                    System.out.println("Nome do fornecedor editado com SUCEESO.");
                                    break;
                                case 3:
                                    int ano;
                                    do{
                                        System.out.println("Digite o novo ano: ");
                                        ano = sc.nextInt();
                                        if(ano<0){
                                            System.out.println("ERRO! Digite novamente.");
                                        }
                                    }while(ano<0);
                                    c1.getLista().get(indiceEncontrado).
                                            getDataVencimento().setAno(ano);
                                    System.out.println("Ano editado com SUCESSO.");
                                        break;
                                case 4:
                                    String estado;
                                    do{
                                        System.out.println("Digite o estado do fornecedor: ");
                                        sc.nextLine();
                                        estado = sc.nextLine();
                                        if(estado.length()<2){
                                            System.out.println("ERRO! Digite novamente.");
                                        }
                                    }while(estado.length()<2);
                                    c1.getLista().get(indiceEncontrado).
                                            getFornecedor().getEndereco().setEstado(estado);
                                    System.out.println("Estado editado com SUCESSO.");
                                    break;
                                case 0:
                                    System.out.println("Operação cancelada.");
                                    break;
                                default:
                                    System.out.println("ERROUUU");
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("PESQUISANDO...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não existem produtos para pesquisar.");
                    }else{
                        do{
                            System.out.println("Digite o código do produto: ");
                            codigo = sc.nextInt();
                            if(codigo<=0){
                                System.out.println("ERRO! Digite novamente. ");
                            }
                        }while(codigo<=0);
                        Produto encontrado = c1.pesquisarPorCodigo(codigo);
                        if(encontrado==null){
                            System.out.println("Não há produto com este código.");
                        }else{
                            System.out.println(encontrado);
                        }
                    }
                    break;
                case 7:
                    System.out.println("PESQUISANDO...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produto para pesquisar.");
                    }else{
                        String cnpj;
                        do{
                            System.out.println("Digite o cnpj: ");
                            cnpj = sc.next();
                            if(cnpj.length()!=14){
                                System.out.println("ERRO!");
                            }
                        }while(cnpj.length()!=14);
                        ArrayList<Produto> encontrados = 
                                c1.pesquisarProdutosFornecedor(cnpj);
                        if(encontrados.isEmpty()){
                            System.out.println("Não há produtos deste fornecedor.");
                        }else{
                            System.out.println(encontrados);
                        }
                    }
                    break;
                case 8:
                    System.out.println("PESQUISANDO...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produto para pesquisar.");
                    }else{
                        double valor;
                        do{
                            System.out.println("Digite o valor: ");
                            valor = sc.nextDouble();
                            if(valor<=0){
                                System.out.println("ERRO!");
                            }
                        }while(valor<=0);
                        ArrayList<Produto> encontrados = 
                                c1.pesquisarAteValor(valor);
                        if(encontrados.isEmpty()){
                            System.out.println("Não há produtos neste valor.");
                        }else{
                            System.out.println(encontrados);
                        }
                    }
                    
                    break;
                case 9:
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há fornecedor para pesquisar.");
                    }else{
                        do{
                            System.out.println("Digite o código do produto: ");
                            codigo = sc.nextInt();
                            if(codigo<=0){
                                System.out.println("ERRO!");
                            }
                        }while(codigo<=0);
                        Fornecedor encontrado = c1.pesquisarFornecedor(codigo);
                        if(encontrado==null){
                            System.out.println("Não há fornecedor deste produto. ");
                        }else{
                            System.out.println(encontrado);
                        }
                    }
                    break;
                case 10:
                    System.out.println("PESQUISANDO...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há fornecedores cadastrados.");
                    }else{
                        String cnpj;
                        do{
                            System.out.println("Digite o cnpj: ");
                            cnpj = sc.next();
                            if(cnpj.length()!=14){
                                System.out.println("ERRO!");
                            }
                        }while(cnpj.length()!=14);
                        String telefoneEncontrado = c1.pesquisarTelefone(cnpj);
                        if(telefoneEncontrado==null){
                            System.out.println("Não há fornecedor com este cnpj");
                        }else{
                            System.out.println(telefoneEncontrado);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Tchau!");
                    
                    break;
                default:
                    System.out.println("ERRO! Opção inválida.");     
            }
        }while(menu!=0);
    }
}
