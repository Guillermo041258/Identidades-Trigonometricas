/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identidadestrigonometricas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author Guillermo Joaquin
 */
public class PedirTriangulos {
    protected  int triangulos;    
   public String[]  n_triangulos;
   private static Scanner entrada;
   public BufferedReader  letras; 
   
   
    public PedirTriangulos(int n_triangulos){
    triangulos = n_triangulos;    
    }
    
    
    
public void  Trigonometrica() throws IOException{
 int contador =0;
entrada = new Scanner(System.in);
letras  = new BufferedReader(new InputStreamReader(System.in));
n_triangulos = new String[triangulos];

System.out.println("Escriba la identidad trigonometrica. Por ejemplo: Seno,coseno, Tangente, cotangente, secante o cosecante");

for(int i =0; i < triangulos; i++){

System.out.println( "Para el triangulo " + (i+1)+ " desea sacar su: ");
n_triangulos[contador] = letras.readLine();
 

if(n_triangulos[contador].equalsIgnoreCase("Seno")){
 System.out.println("El resultado es " + Seno());
}
else if(n_triangulos[contador].equalsIgnoreCase("Coseno"))
 System.out.println("El resultado es " + Coseno());
else if(n_triangulos[contador].equalsIgnoreCase("Tangente"))
 System.out.println("El resultado es " +Tangente());
else if(n_triangulos[contador].equalsIgnoreCase("Contangente"))
 System.out.println("El resultado es " +CoTangente());
else if(n_triangulos[contador].equalsIgnoreCase("Secante"))
 System.out.println("El resultado es " + Secante());
else if(n_triangulos[contador].equalsIgnoreCase("Cosecante")){
  System.out.println("El resultado es " +Cosecante());
 }else{
     System.err.println("Verifica lo ingresado");
 }
contador++;


}

System.out.print("Operaciones finalizadas");

} 


 private static float Seno(){
 float Cateto_opuesto;
 float hipotenusa;
 float seno;
 System.out.println("Escriba el cateto opuesto");
 Cateto_opuesto =  entrada.nextFloat();
 System.out.println("Escriba el valor de la Hipotenusa");
 hipotenusa = entrada.nextFloat();

 seno = Cateto_opuesto /  hipotenusa;   
 return seno;    
 }  

private static  float Coseno(){
float Cateto_adyacente;
float hipotenusa;
float coseno;

System.out.println("Digite el cateto adyancente");
Cateto_adyacente = entrada.nextFloat();

System.out.println("Digite la hipotenusa");
hipotenusa = entrada.nextFloat();

coseno = Cateto_adyacente/ hipotenusa;
 return coseno;   
} 
private static float Tangente(){
  float cateto_opuesto;
  float cateto_adyacente;
  float tangente;
  
  
  System.out.print("Digite el cateto opuesto");
  cateto_opuesto = entrada.nextFloat();
  
 System.out.print("Digite el cateto adyacente");
 cateto_adyacente = entrada.nextFloat();
 
 tangente = cateto_opuesto / cateto_adyacente;
  return tangente;   
}
 
 
 private static float CoTangente(){
  float cateto_opuesto;
  float cateto_adyacente;
  float cotangente;
  
  
  System.out.print("Digite el cateto opuesto");
  cateto_opuesto = entrada.nextFloat();
  
 System.out.print("Digite el cateto adyacente");
 cateto_adyacente = entrada.nextFloat();
 
 cotangente = cateto_adyacente / cateto_opuesto;
  return cotangente;   
}
 private static  float Secante(){
float Cateto_adyacente;
float hipotenusa;
float secante;

System.out.println("Digite el cateto adyancente");
Cateto_adyacente = entrada.nextFloat();

System.out.println("Digite la hipotenusa");
hipotenusa = entrada.nextFloat();

secante = hipotenusa/ Cateto_adyacente;
 return secante;   
} 
 private static float Cosecante(){
 float Cateto_opuesto;
 float hipotenusa;
 float cosecante;
 System.out.println("Escriba el cateto opuesto");
 Cateto_opuesto =  entrada.nextFloat();
 System.out.println("Escriba el valor de la Hipotenusa");
 hipotenusa = entrada.nextFloat();

 cosecante = hipotenusa / Cateto_opuesto;   
 return cosecante;    
 }     

 
}
