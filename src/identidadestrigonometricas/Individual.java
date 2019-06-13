/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identidadestrigonometricas;

import java.util.*;
/**
 *
 * @author Guillermo Joaquin
 */
public class Individual {
   private int  individual; 
private Scanner numero;
 
    protected void Eleccion(){
    
    numero =  new Scanner(System.in);
    try{        
     System.out.print("Ingrese el numero sea para sacar su seno, coseno,tangente");
    individual = numero.nextInt();
    
    System.out.println("El seno de " + individual + " es " + Math.sin(individual));
    System.out.println("El coseno de " + individual + " es " + Math.cos(individual));
   System.out.println("La tangente de " + individual + " es " + Math.tan(individual));
    
    
    
    }catch(InputMismatchException fd){
      System.err.print("Presiona F6");
    }
    
    
        
    }
}
