public class Endereco {
    private String cidade;
    private String estado;
    
    public Endereco(){
        
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return cidade + " - " + estado;
    }
}
