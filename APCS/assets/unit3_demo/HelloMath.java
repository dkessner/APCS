//
// HelloMath.java
//



public class HelloMath
{
    public static void main(String[] args)
    {
        System.out.println("pi:" + Math.PI);
        System.out.println("e:" + Math.E);

        System.out.println("cos(0):" + Math.cos(0));
        System.out.println("sin(0):" + Math.sin(0));
        System.out.println("cos(pi):" + Math.cos(Math.PI));
        System.out.println("sin(pi):" + Math.sin(Math.PI));

        // unit test
        
        double result = Math.sin(Math.PI); 
        
        if (Math.abs(result) < 1e-6)
            System.out.println("Yippee!");
        else
            System.out.println("Bummer.");
    }
}


