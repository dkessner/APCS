//
// ShapeTest.java
//


import java.util.*;


public class ShapeTest
{
    public static void main(String[] args)
    {
        System.out.println("Shape Test");

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle(1, 2));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6, 14));
        shapes.add(new Circle(1));
        shapes.add(new Circle(10));

        for (Shape s : shapes)
        {
            System.out.println(s.getName() + " " + s.getPerimeter() +
                    " " + s.getArea());
        }


    }
}


