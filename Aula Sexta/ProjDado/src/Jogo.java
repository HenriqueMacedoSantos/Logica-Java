public class Jogo {
    private Dado jogadaUsuario;
    private Dado jogadaMaquina;
    
    public Jogo(byte jogadaUsuario){
        this.jogadaUsuario = new Dado(jogadaUsuario);
        byte sorteio = (byte)(Math.random()*6+1);
        this.jogadaMaquina = new Dado(sorteio);
    }
    
    public boolean verificarSeVenceu(){
        byte maq = this.jogadaMaquina.getNumero();
        byte usu = this.jogadaUsuario.getNumero();
        if(maq == usu){
            return true;
        }else{
            return false;
        }   
    }
    
    public Dado getJogadaUsuario() {
        return jogadaUsuario;
    }

    public Dado getJogadaMaquina() {
        return jogadaMaquina;
    }
}
