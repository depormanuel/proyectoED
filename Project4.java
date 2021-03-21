package proyectoED;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/** 
 * Esta clase muestra la jerarquia de figuras matematicas, las vamos a crear por itinerancia.
 * 
 * @author  Manuel Aranda Perez
 * @version 2.0 Date: 21/03/2021
 */
public class Project4 {

    public static void main(String args[]) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter(args[0]));
            ArrayList<Shape> myShapes = new ArrayList<Shape>(30);
            

            Point pt1 = new Point(1, 1);
            Point pt2 = new Point(5, 8);
            Point pt3;
            Point pt4 = new Point();
            
            

            Triangle triangle_1 = new Triangle(pt1, pt2, new Point(10, 4));
            pt1.setX(2);
            pt1.setY(2);
            pt2 = new Point(2, 8);
            pt3 = new Point(12, 2);
            Triangle triangle_2 = new Triangle(pt1, pt2, pt3);
            Triangle triangle_3 = new Triangle(triangle_2);  // invoca el constructor copia

            triangle_2.setPoint2(new Point(5, 8));
            myShapes.add(triangle_1);
            myShapes.add(triangle_2);
            myShapes.add(triangle_3);

            Circle circle_1, circle_2, circle_3;
            circle_1 = new Circle(pt1, 4);
            circle_2 = new Circle(pt2, 12);
            circle_3 = new Circle(circle_2);
            circle_3.setRadius(5);
            myShapes.add(circle_1);
            myShapes.add(circle_2);
            myShapes.add(circle_3);

            Rectangle r1, r2, r3;
            r1 = new Rectangle(10, 3);
            r2 = new Rectangle(20, 4);
            r1.setWidth(3);
            r2.setHeight(10); /*establece la altura*/
            r3 = new Rectangle(r2);
            r3.setHeight(100);
            myShapes.add(r1);
            myShapes.add(r2);
            myShapes.add(r3);

            Sphere sphere_1, sphere_2, sphere_3;
            sphere_1 = new Sphere(4);
            sphere_2 = new Sphere(12);
            sphere_3 = new Sphere(sphere_1);  // invoca el constructor copia
            sphere_3.setRadius(5);
            myShapes.add(sphere_1);
            myShapes.add(sphere_2);
            myShapes.add(sphere_3);

            Cube cube_1, cube_2, cube_3;
            cube_1 = new Cube(4);
            cube_2 = new Cube(12);
            cube_3 = new Cube(cube_1);  // invoca el constructor copia
            cube_3.setSideLength(5);
            myShapes.add(cube_1);
            myShapes.add(cube_2);
            myShapes.add(cube_3);

            Cylinder cy1, cy2, cy3;
            cy1 = new Cylinder(4, 10);
            cy2 = new Cylinder(7, 12);
            cy3 = new Cylinder(cy2);   // invoca el constructor copia
            cy3.setHeight(15);
            cy3.setRadius(10);
            myShapes.add(cy1);
            myShapes.add(cy2);
            myShapes.add(cy3);


            Cone cone_1, cone_2, cone_3;
            cone_1 = new Cone(4, 10);
            cone_2 = new Cone(7, 12);
            cone_3 = new Cone(cone_1);  // invokes the copy constructor
            cone_3.setHeight(15);
            cone_3.setRadius(10);
            myShapes.add(cone_1);
            myShapes.add(cone_2);
            myShapes.add(cone_3);

            for (Shape s : myShapes) {  // para cada vuelta
                out.println(s.getClass().getName());  // imprime el nombre del objeto
                s.print(out);             
                out.println();
            }
            out.close();
        } // cierra try
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }  // cierra catch



    }
}
