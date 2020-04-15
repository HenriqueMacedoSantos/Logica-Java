
/**
 * Write a description of class Main here.
 *
 * @author (Gustavo Cigaran)
 * @version (20/05/2019)
 */
public class Main{
    public static void main(String []args){
        String nome;
        double cargaHoraria;
        double salarioHora;
        double salarioFinal;
        
        nome = "José";
        cargaHoraria = 220;
        salarioHora = 10;
        salarioFinal = cargaHoraria * salarioHora;
        
        System.out.println("\fNome: "+nome);
        System.out.println("Carga Horária: "+cargaHoraria);
        System.out.println("Salário Hora: "+salarioHora);
        System.out.print("Salário Final: "+salarioFinal);
    }
}
