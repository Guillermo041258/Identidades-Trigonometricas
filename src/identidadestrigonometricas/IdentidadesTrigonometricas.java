/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identidadestrigonometricas;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Guillermo Joaquin 
 */
public class IdentidadesTrigonometricas {
private static  Scanner ingreso;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
  ingreso = new Scanner(System.in);
  int opcion;
   System.out.println("Digite 1 si quiere sacar identidades trigonometricas o 2 para sacar seno, coseno, tangente de un numero");
   opcion = ingreso.nextInt();
  if(opcion == 1){    
         
      IdentidadesTrigonometricas id = new IdentidadesTrigonometricas();
      id.n_triangulos();
  }else if(opcion == 2){
  Individual  opcion2 = new Individual();    
  opcion2.Eleccion();
  }else{
      System.out.print("Opcion inexistente");
  }
     
      
    }
    
    public void n_triangulos() throws IOException{
      ingreso  = new Scanner(System.in);  
        
      
try{
        int nu_triangulos;
    System.out.print("¿Cuantos triagulos va sacar sus identidades trigonometricas?");
    nu_triangulos = ingreso.nextInt();
    PedirTriangulos pila = new PedirTriangulos(nu_triangulos);    
      pila.Trigonometrica();
}catch(InputMismatchException error2){
    
    System.err.print("Presiona F6");
    
}
   
      
} 
}
