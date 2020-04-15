
import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Jogo> lista;
    
    //pega o ArrayList
    public Cadastro(){
        this.lista=new ArrayList<>();
    }
    //puxa todos os dados
    @Override
    public String toString() {
        return "Lista De Gaymes:" + lista;
    }
    //metodos acessores
    public ArrayList<Jogo> getLista() {
        return lista;
    }
    //metodos acessores
    public void setLista(ArrayList<Jogo> lista) {
        this.lista = lista;
    }
    //adiciona a lista
    public void cadastrar (Jogo array){
        this.lista.add(array);
    }
    //metodo para ver quantidade de protudots
    public int verQuantidade(){
        return this.lista.size();
    }
    
    public Jogo pesquisarPorCodigo(int codigo){
        Jogo achei=null;
        for(int i=0; i<this.lista.size() && achei==null;i++){
            if(this.lista.get(i).getCodigo()==codigo){
                achei=this.lista.get(i);
            }
        }
            return achei;
    }
    public Jogo pesquisarPorFornecedor(String email){
        Jogo achei=null;
        for(int i=0; i<this.lista.size() && achei==null;i++){
            if(this.lista.get(i).getFornecedor().getEmail().equalsIgnoreCase(email)){
                achei=this.lista.get(i);
            }
        }
        return achei;
    }
    
    public void remover(Jogo j){
        this.lista.remove(j);
    }
    public int pesquisaIndice(int codigo){
        int achei = -1;
        for(int i = 0; i<this.lista.size() && achei==-1; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                achei = i;
            }
        }
        return achei;
    }
    
    public Fornecedor pesquisarFornecedorDeUmJogo(int codigo){
        Fornecedor achei = null;
        for(int i=0; i<this.lista.size() && achei==null; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                achei=this.lista.get(i).getFornecedor();
            }
        }
        return achei;
    }
    
    public String pesquisarTelefoneDoFornecedor(String email){
        String achei = null;
        for(int i = 0; i<this.lista.size() && achei == null; i++){
            if(this.lista.get(i).getFornecedor().getEmail().equalsIgnoreCase(email)){
                achei = this.lista.get(i).getFornecedor().getTelefone();
            }
        }
        return achei;
    }
    
    public ArrayList <Jogo> pesquisarJogoPorEstado(String estado){
        ArrayList<Jogo> achei=new ArrayList<>();
        for(int i = 0; i<this.lista.size(); i++){
            if(this.lista.get(i).getFornecedor().getEndereco().getEstado().equalsIgnoreCase(estado)){
                achei.add(this.lista.get(i));
            }
        }
        return achei;
    }
}
