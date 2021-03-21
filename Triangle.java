package proyectoED;


import java.io.PrintWriter;

/**
 * Esta es la clase triangulo, extiende de la clase TwoDimensionalShape.
 * La clase rectangulo contiene punto1 punto2 y punto3 de tipo Point.
 * 
 * 
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 */

class Triangle extends TwoDimensionalShape {

    //Instancia las variables punto1, punto2, y punto3.
    private Point point1, point2, point3;

    /**
     * Constructor por defecto que toma tres puntos para crear el triangulo.
     */
    public Triangle(Point pt1, Point py2, Point py3) 
    {
        this.point1 = pt1;
        this.point2 = py2;
        this.point3 = py3;
    }

    
    
    /**
     * Constructor para clonar el objeto. 
     */
    public Triangle(Triangle t) 
    {
        this.point1 = t.point1;
        this.point2 = t.point2;
        this.point3 = t.point3;
    }

    
    
    /**
     * Metodo que devuelve el valor del punto1.
     */
    public Point getPoint1() 
    {
        return point1;
    }

    /**
     * Metodo que establece el valor de punto1.
     */
    public void setPoint1(Point point1) 
    {
        this.point1 = point1;
    }

    
    /**
     * Metodo que devuelve el valor de punto2.
     */
    public Point getPoint2() 
    {
        return point2;
    }

    
    /**
     * Metodo que establece el valor de punto2.
     */
    public void setPoint2(Point point2) 
    {
        this.point2 = point2;
    }

    
    
    /**
     * Metodo que devuelve el valor de punto3.
     */
    public Point getPoint3()
    {
        return point3;
    }

    /**
     * Metodo que establece el valor de punto3.
     */
    public void setPoint3(Point point3) 
    {
        this.point3 = point3;
    }

    
    /**
     * Sobreescribe el metodo print, para imprimir los parametros del triangulo
     * en un archivo externo.
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Triangle Data => "+ "\r\n");
        out.write("\n Point 1 = " + this.point1.getX() + " , " + this.point1.getY()+ "\r\n");
        out.write("\n Point 2 = " + this.point2.getX() + " , " + this.point2.getY()+ "\r\n");
        out.write("\n Point 3 = " + this.point3.getX() + " , " + this.point3.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");   
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n\n\n");;
    }

    
    /**
     * Sobreescribe el metodo getArea.
     * Devuelve el area del triangulo.
     */
    @Override
    public double getArea() 
    {

        double area;
        double perimeter = this.getPerimeter()/2;

        double a = this.point1.getX() + this.point1.getY();
        double b = this.point2.getX() + this.point2.getY();
        double c = this.point3.getX() + this.point3.getY();

        area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }

    /**
     * Sobreescribe el metodo getPerimeter.
     * Devuelve el perimetro del triangulo.
     */
    @Override
    public double getPerimeter() 
    {

        double sum =  0 ;
        sum +=  this.point1.getX() + this.point1.getY();
        sum += this.point2.getX() + this.point2.getY();
        sum += this.point3.getX() + this.point3.getY();
        return sum;

      
        
    }
}
