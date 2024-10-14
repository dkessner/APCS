//
// Circle.java
//


public class Circle
{
    public Circle(double radiusIn)
    {
        radius = radiusIn;
    }

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
        //return Math.PI * Math.pow(radius, 2);
    }

    private double radius;
}


