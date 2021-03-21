package proyectoED;


import java.io.PrintWriter;

/**
 * Esta es la clase cono, extiende de la clase ThreeDimensionalShape.
 * La clase circulo contiene radio y altura.
 * 
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 */

 class Cone extends ThreeDimensionalShape{
    //Instancia las variables radio y altura.
    double radius;
    double height;
    
    /**
     * Constructor por defecto que toma el radio y la altura del cono para
     * crear el objeto.
     */
    public Cone(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }
     
    
    /**
     * Constructor para clonar el objeto.
     */ 
    public Cone(Cone con)
    {
         this.radius = con.radius;
         this.height = con.height;
    }
    
    
  
    /**
     * Metodo que devuelve el radio del cono.
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * Metodo para establecer el radio del cono.
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    
    /**
     * Metodo que devuelve la altura del cono.
     */
    public double getHeight() 
    {
        return height;
    }

    
    
    /**
     * Metodo para establecer la altura del cono.
     */
    public void setHeight(double height) 
    {
        this.height = height;
    }

    
    
    /**
     * Sobreescribe el metodo getSurfaceArea.
     * Devuelve el area superficial del cono.
     */
    @Override
    public double getSurfaceArea() 
    {

        return (Math.PI * (this.radius * this.radius) * this.height) / 3;
    }

    
    /**
     * Sobreescribe el metodo getVolume.
     * Devuelve el volumen del cono.
     */
    @Override
    public double getVolume() 
    {

        return (Math.PI * (this.radius)) * (this.radius  + Math.sqrt( ( this.radius * this.radius) + (this.height * this.height)));
        
    }

    
    
    /**
     * Sobreescribe el metodo print, para imprimir los parametros del cono
     * en un archivo externo.
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Radius  = " + this.getRadius()+ "\r\n");
        out.write("\n Height  = " + this.getHeight()+ "\r\n");
        out.write("\n  Surface  Area = " + this.getVolume() + "\r\n");
        out.write("\n  Volume  = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n\n\n");
    }
     
}
