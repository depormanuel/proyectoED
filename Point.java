package proyectoED;


import java.io.PrintWriter;

/**
 *  La clase punto, esta representada por un par de coordenadas Cartesianas.
 *  Esta clase no es parte del proyecto, pero es usada en otras clases.
 *  Usaremos x e y como coordenadas.
 *  
 *  @author  Manuel Aranda Perez
 *  @version 2.0 Date: 21/03/2021
 */
class Point 
{
    // Instacia las variables x e y, representan las coordenadas.
    private double x ;
    private double y;

    /**
     * Constructor por defecto que establece las coordenadas x e y.
     */
    public Point() 
    {
        this.x = 0.0;
        this.y = 0.0 ;
    }

    
    /**
     * Este constructor toma dos double e inicializa las variables.
     */
    public Point(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    
    
     /**
     * Constructor para clonar el objeto.
     */
    public Point(Point pnt)
    {
        this.x = pnt.x;
        this.y = pnt.y;
    }
    
   
     /**
     * Metodo que devuelve el valor de x.
     */
    public double getX() 
    {
        return x;
    }
    
    
     /**
     * Metodo que establece el valor de x.
     */
    public void setX(double x) 
    {
        this.x = x;
    }
    
    
    /**
     * Metodo que devuelve el valor de y.
     */
    public double getY() 
    {
        return y;
    }
    
    
    /**
     * Metodo que establece el valor de y.
     */
    public void setY(double y) 
    {
        this.y = y;
    }
    
    
    /**
     * Este es el metodo distance (distancia) que devuelve la distancia entre este punto y otro punto
     * Toma un objeto de tipo Point como parametro.
     * El parametro calcula la distancia de la linea.
     */
    public double  distance(Point p)
    {
        return Math.sqrt( ((this.x - p.x)  * (this.x - p.x))  + ((this.y - p.y)  * (this.y - p.y)));
  
    }
    
    
    /**
     * Sobreescribe el metodo print, para imprimir los parametros del punto
     * en un archivo externo.
     */
    public void print(PrintWriter out)
    {
        
        out.write("\n Point Data => ");
        out.write("\nPrint Data = x = " + x + " y = " + y);
        out.write("\n\n\n");;
    }
    
    
}
