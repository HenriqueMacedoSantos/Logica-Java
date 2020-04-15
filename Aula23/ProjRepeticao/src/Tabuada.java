public class Tabuada {
    private int numero;
    //Método:
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nNumero: " + numero;
    }
    public int calcularTabuada(int cont){
        return this.numero * cont;
    }
    public int calcularFatorial(){
        int cont = 1;
        int acum = 1;
        while(cont<=this.numero){
            acum = acum * cont;
            cont++;
        }
        return acum;
    }
    public int verFatorial(){
        return this.calcularFatorial();
    }
}