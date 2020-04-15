import java.util.ArrayList;
public class Cadastro {
    private ArrayList<Produto> lista;
    
    public Cadastro(){
        this.lista = new ArrayList<>();
    }

    public ArrayList<Produto> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Produto> lista) {
        this.lista = lista;
    }
    @Override
    public String toString() {
        return "Lista de Produtos: " + lista;
    }
    //Método para cadastrar:
    public void cadastrar(Produto p){
        this.lista.add(p);
    }
    //Método para ver Quantidade de Produtos:
    public int verQuantidade(){
        return this.lista.size();
    }
    //Método para remover:
    public void remover(Produto p){
        this.lista.remove(p);
    }
    
    //Pesquisa Específica
    //Retorna nenhum ou um.
    public Produto pesquisarPorCodigo(int codigo){
        Produto achei = null;
        for(int i=0;i<this.lista.size() && achei==null; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                achei = this.lista.get(i);
            }
        }
        return achei;
    }
    
    //Pesquisar Fornecedor de um produto:
    public Fornecedor pesquisarFornecedor(int codigo){
        Fornecedor achei = null;
        for(int i=0; i<this.lista.size() && achei==null; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                achei = this.lista.get(i).getFornecedor();
            }
        }
        return achei;
    }
    
    public String pesquisarTelefone(String cnpj){
        String achei = null;
        for(int i=0; i<this.lista.size() && achei==null; i++){
            if(this.lista.get(i).getFornecedor().getCnpj()
                    .equals(cnpj)){
                achei = this.lista.get(i).getFornecedor()
                        .getTelefone();
            }
        }
        return achei;
    }
    
    //Pesquisar Indice:
    public int pesquisaIndice(int codigo){
        int achei = -1;
        for(int i = 0; i<this.lista.size() && achei==-1; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                achei = i;
            }
        }
        return achei;
    }
    
    //Pesquisar por valor:
    public ArrayList<Produto> pesquisarAteValor(double valor){
        ArrayList<Produto> achados = new ArrayList<>();
        for(int i = 0; i<this.lista.size(); i++){
            if(this.lista.get(i).getValor()<=valor){
                achados.add(this.lista.get(i));
            }
        }
        return achados;
    }
    
    //Pesquisar por fornecedor:
    public ArrayList<Produto> pesquisarProdutosFornecedor(String cnpj){
        ArrayList<Produto> achados = new ArrayList<>();
        for(int i = 0; i<this.lista.size(); i++){
            if(this.lista.get(i).getFornecedor().getCnpj().equals(cnpj)){
                achados.add(this.lista.get(i));
            }
        }
        return achados;
    }
}
