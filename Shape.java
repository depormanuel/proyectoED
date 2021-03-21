package proyectoED;


import java.io.PrintWriter;

/**
 * Esta es la clase shape, representa area y perimetro
 * de esta clase heredan otras.
 * 
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 */

abstract class Shape {
    
   public void print(PrintWriter out) {
  
   }
   
   /**
     * Devuelve un 0, esta clase se sobreescribira.
     * Devuelve el valor del area.
   */
   public double getArea()
   {
       return 0;
       
   }
   
   /**
     * Devuelve un 0, esta clase se sobreescribira.
     * Devuelve el valor del perimetro.
     */
   public double getPerimeter()
   {
       return 0;
   }
   
}
