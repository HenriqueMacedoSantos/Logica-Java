import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Cadastro c=new Cadastro();
        //menu:
        byte menu;
        do{
            System.out.println("\n====♥ESCOLHA♥===="
                    + "\n1 - Cadastrar Novo Jogo."
                    + "\n2 - Mostrar Jogos."
                    + "\n3 - Ver Quantidade Jogos."
                    + "\n4 - Excluir Um Jogo."
                    + "\n5 - Editar Jogo."
                    + "\n6 - Pesquisar Jogos Por Gênero."
                    + "\n7 - Pesquisar Jogo Por Nome Do Fornecedor."
                    + "\n8 - Pesquisar Fornecedor de um Jogo"
                    + "\n9 - Pesquisar Telefone De Um Fornecedor"
                    + "\n10 - Pesquisar Jogo Pelo Estado Do Fornecedor"
                    + "\n0 - Sair.");
            menu=leia.nextByte();
            
            switch(menu){
                case 1:
                    System.out.println("Cadastrar O Jogo");
                    Jogo j=new Jogo();
                    int codigo;
                    if(c.getLista().isEmpty()){
                        codigo=1;
                    }else{
                        codigo = c.getLista().get(c.getLista().size()-1).getCodigo()+1;
                    }
                    j.setCodigo(codigo);
                    byte classificacao;
                    do{
                        System.out.println("====♥CLASSIFICAÇÃO♥===="
                                + "\n1 - Livre"
                                + "\n2 - 10 anos"
                                + "\n3 - 12 anos"
                                + "\n4 - 14 anos"
                                + "\n5 - 16 anos"
                                + "\n6 - 18 anos");
                    classificacao = leia.nextByte();
                    
                    }while(classificacao<1 || classificacao>6);
                    j.setClassificacao(classificacao);
                    
                    do{
                        System.out.println("Digite o Nome Do Jogo: ");
                        leia.nextLine();
                        j.setNome(leia.nextLine());
                        if(j.getNome().length()<2){
                            System.out.println("Nome Muito Curto.");
                        }
                    }while(j.getNome().length()<2);
                    byte genero;
                    do{
                        System.out.println("====♥CLASSIFICAÇÃO♥===="
                                + "\n1 - Ação/Aventura."
                                + "\n2 - Luta."
                                + "\n3 - FPS."
                                + "\n4 - RPG."
                                + "\n5 - Esportes."
                                + "\n6 - Corrida.");
                        genero = leia.nextByte();
                        if(classificacao<1 || classificacao>6){
                            System.out.println("ERRO! Número Inválido.");
                        }
                    }while(classificacao<1 || classificacao>6);
                    do{
                        System.out.println("Digite a Quantidade De Caixa.");
                        j.setQuantidade(leia.nextInt());
                        if(j.getQuantidade()<=0){
                            System.out.println("Quantidade Negativa Ou Nula.");
                        }
                    }while(j.getQuantidade()<=0);
                    do{
                        System.out.println("Digite a Quantidade De Jogos Por Caixas.");
                        j.setQuantidadeCaixa(leia.nextInt());
                        if(j.getQuantidadeCaixa()<=0){
                            System.out.println("Quantidade Negativa Ou Nula");
                        }
                    }while(j.getQuantidadeCaixa()<=0);
                    do{
                        System.out.println("Digite o Valor Do Jogo: ");
                        j.setValor(leia.nextDouble());
                        if(j.getValor()<0){
                            System.out.println("Deixa Eu Ver Se Entendi Não Posso Digitar Valor Negativo?");
                        }
                    }while(j.getValor()<0);
                    
                    Data d = new Data();
                    boolean erroData;
                    System.out.println("Informe a Data De Lançamento");
                    do{
                        System.out.println("Digite o Dia: ");
                        d.setDia(leia.nextByte());
                        System.out.println("Digite o Mês: ");
                        d.setMes(leia.nextByte());
                        System.out.println("Digite o Ano: ");
                        d.setAno(leia.nextInt());
                        erroData = d.verificarErro();
                        if(erroData){
                            System.out.println("Data Invalida");
                        }
                    }while(erroData);
                    System.out.println(d);
                    
                    j.setDataLancamento(d);
                    
                    Fornecedor f=new Fornecedor();
                    
                    System.out.println("Informe Os Dados Do Forncedor: ");
                    do{
                        System.out.println("Digite o Nome Do Fornecedor: ");
                        leia.nextLine();
                        f.setNome(leia.nextLine());
                        if(j.getNome().length()<2){
                            System.out.println("Nome Muito Curto.");
                        }
                    }while(j.getNome().length()<2);
                    do{
                        System.out.println("Digite o Telefone(DDD Do País e Do Estado): ");
                        f.setTelefone(leia.nextLine());
                        if(f.getTelefone().length()<13){
                            System.out.println("Telefone Invalido");
                        }
                    }while(f.getTelefone().length()<13);
                    boolean valida;
                    String email;
                    do{
                        System.out.println("Insira o E-mail Do Fornecedor: ");
                        email=leia.nextLine();
                    if(f.valida(email)){
                        System.out.println("ERRO! E-mail Invalido");
                    }                    
                    }while(f.valida(email));
                    f.setEmail(email);
                    Endereco e=new Endereco();
                    System.out.println("Informe o Endereço Do Fornecedor: ");
                    System.out.println("Digite a Rua Do Fornecedor.");
                    e.setRua(leia.nextLine());
                    do{
                        System.out.println("Insira o Numero Da Empresa");
                        e.setNumero(leia.nextInt());
                        if(e.getNumero()<0){
                            System.out.println("ERRO! Número Inválido.");
                        }
                    }while(e.getNumero()<0);
                    System.out.println("Digite a Cidade: ");
                    leia.nextLine();
                    e.setCidade(leia.nextLine());
                    System.out.println("Digite o Estado Do Fornecedor: ");
                    e.setEstado(leia.nextLine());
                    f.setEndereco(e);
                    
                    j.setFornecedor(f);
                    
                    c.cadastrar(j);
                break;
                case 2:
                    System.out.println("Ver Jogos Cadastrado");
                    if(c.getLista().isEmpty()){
                        System.out.println("Não há Produtos Cadastrados");
                    }else{
                        System.out.println(c);
                    }
                break;
                case 3:
                    System.out.println("Quantidade Jogos Cadastrados: ");
                    if(c.getLista().isEmpty()){
                        System.out.println("Não Existem Jogos Cadastrados");
                    }else if(c.verQuantidade()==1){
                            System.out.println("Existe Um Jogo Cadastrado");
                    }else{
                        System.out.println("Existem "+c.verQuantidade()+ "Jogos Cadastrados.");
                    }
                break;
                case 4:
                    System.out.println("EXCLUIR PRODUTO...");
                    if(c.getLista().isEmpty()){
                        System.out.println("Não há produtos cadastrados.");
                    }else{
                        byte senha;
                        System.out.println("Insira a Senha Para a Exclusão");
                        senha=leia.nextByte();
                        if(senha==123){
                            System.out.println("Digite o Código: ");
                            codigo = leia.nextInt();
                            Jogo encontrado = c.pesquisarPorCodigo(codigo);
                            if(encontrado==null){
                                System.out.println("Não há Este Produto.");
                            }else{
                                byte confirma;
                                System.out.println("Tem Certeza Que Deseja Excluir: "+encontrado.getNome()+"?"
                                        + "\n Digite 1 Para Sim."
                                        + "\n Digite 2 Para Não");
                                confirma = leia.nextByte();
                                switch(confirma){
                                    case 1:
                                        c.remover(encontrado);
                                        System.out.println("Removido.");
                                        break;
                                    case 2:
                                        System.out.println("Operação Cancelada.");
                                        break;
                                    default:
                                        System.out.println("ERRO! Opção Inválida.");
                                }
                            }
                        
                        }else{
                            System.out.println("Senha Invalida");
                            
                        }                        
                    }
                    break;
                case 5:
                    System.out.println("EDITAR JOGOS...");
                    if(c.getLista().isEmpty()){
                        System.out.println("Não há Jogos Cadastrados. ");
                    }else{
                        System.out.println("Digite o Código Do Jogo Que Deseja Editar:");
                        codigo = leia.nextInt();
                        int indiceEncontrado = c.pesquisaIndice(codigo);
                        if(indiceEncontrado==-1){
                            System.out.println("Não Existe Um Jogo Com Esse Codigo.");
                        }else{
                            byte escolha;
                            System.out.println("O Que Deseja Editar?"
                                    + "\n1 - Nome Do Jogo"
                                    + "\n2 - Nome Do Fornecedor"
                                    + "\n3 - Ano De Lancamento"
                                    + "\n4 - Estado Do Fornecedor"
                                    + "\n0 - Cancelar Edição");
                            escolha = leia.nextByte();
                            switch(escolha){
                                case 1:
                                    System.out.println("Digite o Novo Nome Para o Jogo "+c.getLista().get(indiceEncontrado).getNome());leia.nextLine();
                                    c.getLista().get(indiceEncontrado).setNome(leia.nextLine());
                                    System.out.println("Nome Do Jogo Editado.");
                                    break;
                                case 2:
                                    String nome;
                                    do{
                                        System.out.println("Digite o Novo Nome Para o Fornecedor: ");
                                        leia.nextLine();
                                        nome = leia.nextLine();
                                        if(nome.length()<2){
                                            System.out.println("ERRO!");
                                        }
                                    }while(nome.length()<2);
                                    c.getLista().get(indiceEncontrado).getFornecedor().setNome(nome);
                                    System.out.println("Nome Do Fornecedor Editado.");
                                    break;
                                case 3:
                                    int ano;
                                    do{
                                        System.out.println("Digite o Novo Ano: ");
                                        ano = leia.nextInt();
                                        if(ano<0){
                                            System.out.println("ERRO! Digite Novamente.");
                                        }
                                    }while(ano<0);
                                    c.getLista().get(indiceEncontrado).getDataLancamento().setAno(ano);
                                    System.out.println("Ano Editado.");
                                        break;
                                case 4:
                                    String estado;
                                    do{
                                        System.out.println("Digite o Estado Do Fornecedor: ");
                                        leia.nextLine();
                                        estado = leia.nextLine();
                                        if(estado.length()<2){
                                            System.out.println("ERRO! Digite Novamente.");
                                        }
                                    }while(estado.length()<2);
                                    c.getLista().get(indiceEncontrado).
                                            getFornecedor().getEndereco().setEstado(estado);
                                    System.out.println("Estado Editado.");
                                    break;
                                case 0:
                                    System.out.println("Operação Cancelada.");
                                    break;
                                default:
                                    System.out.println("ERROUUU");
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Pesquisando ");
                    if(c.getLista().isEmpty()){
                        System.out.println("Não Existem Produtos Para Pesquisar.");
                    }else{
                        do{    
                            System.out.println("Digite Codigo Do Produto: ");
                            codigo=leia.nextInt();
                            if(codigo<=0){
                                System.out.println("ERRO! Digite Novamente.");
                            }
                        }while(codigo<=0);
                        Jogo encontrado = c.pesquisarPorCodigo(codigo);
                        if(encontrado==null){
                            System.out.println("Não Há Produtos");
                        }else{
                            System.out.println(encontrado);
                        }
                    }
                    
                break;
                case 7:
                    
                    System.out.println("Pesquisando ");
                    if(c.getLista().isEmpty()){
                        System.out.println("Não Existem Produtos Para Pesquisar.");
                    }else{
                            System.out.println("Digite o Email Do Fornecedor: ");
                            leia.nextLine();
                            email=leia.nextLine();
                            Jogo encontrado = c.pesquisarPorFornecedor(email);
                            if(encontrado==null){
                                System.out.println("Não Há Produtos");
                            }else{
                                System.out.println(encontrado);
                            }
                        }   
                break;
                case 8:
                    System.out.println("Pesquisando ");
                    if(c.getLista().isEmpty()){
                        System.out.println("Não Existe Fornecedor Cadastrado.");
                    }else{
                        System.out.println("Digite o Código do Fornecedor: ");
                        codigo = leia.nextByte();
                        Fornecedor encontrado = c.pesquisarFornecedorDeUmJogo(codigo);
                        if(encontrado==null){
                            System.out.println("Não Existe Fornecedor.");
                        }else{
                            System.out.println(encontrado);
                        }
                    }
                break;
                case 9:
                    System.out.println("Pesquisando ");
                    if(c.getLista().isEmpty()){
                        System.out.println("Não existe Telefone Cadastrado.");
                    }else{
                        System.out.println("Digite o Email do Fornecedor: ");
                        leia.nextLine();
                        email = leia.nextLine();
                        String encontrado = c.pesquisarTelefoneDoFornecedor(email);
                        if(encontrado==null){
                            System.out.println("Não existe Telefone.");
                        }else{
                            System.out.println(encontrado);
                        }
                    }
                break;
                case 10:
                    String estado;
                    System.out.println("Pesquisando ");
                    if(c.getLista().isEmpty()){
                        System.out.println("Não existe Produtos para Pesquisar.");
                    }else{
                        System.out.println("Digite o Estado Do Fornecedor:");
                        leia.nextLine();
                        estado = leia.nextLine();
                        ArrayList<Jogo> encontrado = c.pesquisarJogoPorEstado(estado);
                        if(encontrado == null){
                            System.out.println("Não Há Produtos.");
                        }else{
                            System.out.println(encontrado);
                        }
                    }
                break;
                case 0:
                    System.out.println("888888888888 ,ad8888ba,  88        88        db       88        88  \n" +
"     88     d8\"'    `\"8b 88        88       d88b      88        88  \n" +
"     88    d8'           88        88      d8'`8b     88        88  \n" +
"     88    88            88-ÉUSGURI88     d8'  `8b    88        88  \n" +
"     88    88            88\"\"\"\"\"\"\"\"88    d8YaaaaY8b   88        88  \n" +
"     88    Y8,           88        88   d8\"\"\"\"\"\"\"\"8b  88        88  \n" +
"     88     Y8a.    .a8P 88        88  d8'        `8b Y8a.    .a8P  \n" +
"     88      `\"Y8888Y\"'  88        88 d8'          `8b `\"Y8888Y\"'");
                break;
                
                default:
                     //Limpar tela:
                
                    try {
                        Robot pressbot = new Robot();
                        pressbot.keyPress(17);
                        pressbot.keyPress(76);
                        pressbot.keyRelease(17);
                        pressbot.keyRelease(76);
                    } catch (AWTException awte) {
                    }
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Opçao inválida");    
            }
        }while(menu!=0);
    }
}