package proyectoED;


/**
 * Esta es la clase ThreeDimensionalShape , representa area y volumen de esas clases.
 * de esta clase heredan otras.
 * 
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 */

abstract class ThreeDimensionalShape extends Shape{
 
    /**
     * Devuelve un 0, esta clase se sobreescribira.
     * Devuelve el valor del area de superficie.
     */
    public double getSurfaceArea()
    {
        return 0 ;
    }
    
    
    /**
     * Devuelve un 0, esta clase se sobreescribira.
     * Devuelve el valor del volumen.
     */
    public double getVolume()
    {
        return 0;
    }
    
}
