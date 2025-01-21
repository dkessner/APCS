//
// Rectangle.java
//


public class Rectangle implements Shape
{
    public Rectangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public String getName()
    {
        return "Rectangle";
    }

    public double getPerimeter()
    {
        return 2*base + 2*height;
    }

    public double getArea()
    {
        return base*height;
    }

    private double base;
    private double height;
}


