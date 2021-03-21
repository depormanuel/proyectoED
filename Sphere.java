package proyectoED;


import java.io.PrintWriter;

/**
 * Esta es la clase esfera, extiende de la clase ThreeDimensionalShape.
 * La clase cono contiene radio
 * 
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 */

public class Sphere extends ThreeDimensionalShape{
    //Instancia la variable radio.
    double radius ;

    /**
     * Constructor por defecto que toma el radio crear el objeto.
     */
    public Sphere(double radius) 
    {
        this.radius = radius;
    }
    
    
    /**
     *  Constructor para clonar el objeto.
     */
    public Sphere(Sphere sp)
    {
        this.radius = sp.radius;
    }

    
     /**
     * Metodo que devuelve el radio de la esfera.
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * Metodo que establece el radio de la esfera.
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * Sobreescribe el metodo getSurfaceArea.
     * Devuelve el area superficial de la esfera.
     */
    @Override
    public double getSurfaceArea() 
    {
        
        return 4 * Math.PI * this.radius * this.radius;
        
    }

    
    /**
     * Sobreescribe el metodo getVolume.
     * Devuelve el volumen de la esfera.
     */
    @Override
    public double getVolume() 
    {
        return (4 * Math.PI * this.radius * this.radius * this.radius ) / 3;
    }

    
    /**
     * Sobreescribe el metodo print, para imprimir los parametros del rectangulo
     * en un archivo externo.
     */
    @Override
    public void print(PrintWriter out)
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
   
    
}
