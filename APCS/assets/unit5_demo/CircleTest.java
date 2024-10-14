//
// CircleTest.java
//


public class CircleTest
{
    public static void main(String[] args)
    {
        Circle c = new Circle(10);
        System.out.println("circumference: " + c.circumference());
        System.out.println("area: " + c.area());

        Circle d = new Circle(1);
        System.out.println("circumference: " + d.circumference());
        System.out.println("area: " + d.area());
    }
}


