package proyectoED;


import java.io.PrintWriter;
/**
 * Esta es la clase circulo, que contiene radio y centro del circulo
 * El centro es un objeto de tipo Point, definido previamente. jose
 * 
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 */

public class Circle  extends TwoDimensionalShape{
    //Instanciamos las variables radius y center.
    private double  radius ;
    private Point center;

    /**
     * Constructor por defecto que toma el radio y el centro del circulo para
     * crear el objeto.
     */
    public Circle( Point center,double radius) 
    {
        this.radius = radius;
        this.center = center;
    }
    
    
    /**
     * Constructor para clonar el objeto. 
     */
    public Circle(Circle circle)
    {
        this.radius = circle.radius;
        this.center = circle.center;
    }

    
    /**
     * Metodo que devuelve el radio del circulo.
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * Metodo para establecer el radio del circulo.
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
    * Metodo que devuelve el centro del circulo.
     */
    public Point getCenter() 
    {
        return center;
    }

    
    
    /**
     * Metodo para establecer el centro del circulo.
     */
    public void setCenter(Point center) 
    {
        this.center = center;
    }

    
    
    /**
     * Sobreescribe el metodo print, para imprimir los parametros del circulo
     * en un archivo externo.
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Cirle: "+ "\r\n");
        out.print("\n Center = " + this.center.getX() + " " + this.center.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");;
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Radius = " + this.getRadius()+ "\r\n");;
        out.write("\n\n\n");
    }

    
    /**
     * Sobreescribe el metodo getArea.
     * Devuelve el area del circulo.
     */
    @Override
    public double getArea() 
    {
        return Math.PI * this.radius * this.radius ;
    }

    
    /**
     * Sobreescribe el metodo getPerimeter.
     * Devuelve el perimetro del circulo.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    
    
    
}

    

