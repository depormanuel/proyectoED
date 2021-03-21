package proyectoED;

import java.io.PrintWriter;
/**
 * Esta es la clase rectangulo, extiende de la clase TwoDimensionalShape.
 * La clase rectangulo contiene largo y ancho.
 * 
 * 
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 */

 class Rectangle  extends TwoDimensionalShape{

    //Instancia las variables largo y ancho.
     double length;  
     double width;   
     
    /**
     * Constructor por defecto que toma el largo y ancho del rectangulo para
     * crear el objeto.
     */
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
     
     
    /**
     * Constructor para clonar el objeto. 
     */
    public Rectangle(Rectangle rect)
    {
        this.length = rect.length;
        this.width = rect.width;
    }

    
    /**
     * Metodo que devuelve el largo del rectangulo.
     */
    public double getLength() 
    {
        return length;
    }

    
    
    /**
     * Metodo que establece el largo del rectangulo.
     */
    public void setHeight(double length) 
    {
        this.length = length;
    }
    
    

    /**
     * Metodo que devuelve el ancho del rectangulo.
     */
    public double getWidth() 
    {
        return width;
    }

    
    /**
     * Metodo que establece el ancho del rectangulo.
     */
    public void setWidth(double width) 
    {
        this.width = width;
    }
    

    
    /**
     * Sobreescribe el metodo print, para imprimir los parametros del rectangulo
     * en un archivo externo.
     */
    @Override
    public void print(PrintWriter out) 
    {
       
        super.print(out);
        out.write("\n Area = " + this.getArea()+ "\r\n");
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Is Square? = " + this.isSquare()+ "\r\n");;
        out.write("\n\n\n");
        
    }

    
    
    /**
     * Sobreescribe el metodo getArea.
     * Devuelve el area del rectangulo.
     */
    @Override
    public double getArea() 
    {
        return this.length * this.width;
    }
    
    

    /**
     * Sobreescribe el metodo getPerimeter.
     * Devuelve el perimetro del rectangulo.
     */
    @Override
    public double getPerimeter() 
    {
        return 2 * (this.length + this.width);
    }
    
    
    
    /**
     * El metodo isSquare devuele un booleano dependiendo de la altura y el ancho.
     * Verdadero sera un cuadrado, y falso sera un rectangulo.
     */
    public boolean  isSquare()
    {
        if(this.length == this.width)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     
}
