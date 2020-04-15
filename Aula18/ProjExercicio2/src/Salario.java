public class Salario {
     public double salario;
     
     public double calcularSalario(){
         if(salario<=500){
             return salario * 1.30;
         }else{
             return salario;
         }
     }
}