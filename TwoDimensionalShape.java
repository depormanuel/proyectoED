package proyectoED;


/**
 * Esta es la clase TwoDimensionalShape , representa permetro y area de esas clases.
 * de esta clase heredan otras.
 * 
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 */

abstract  class TwoDimensionalShape extends Shape{
    
  
   /**
     * Devuelve un 0, esta clase se sobreescribira.
     * Devuelve el valor del perimetro.
     * Esta clase hereda de la clase Shape
     */ 
   @Override
   public double getPerimeter()
   {
        return 0 ;
   }
    
   /**
     * Devuelve un 0, esta clase se sobreescribira.
     * Devuelve el valor del area.
     * Esta clase hereda de la clase Shape
     */
   @Override
   public double getArea()
   {
        return 0;
   }


}
