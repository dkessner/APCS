# Functions.java
```java
//
// Functions.java
//


public class Functions
{
    public static void hello()
    {
        System.out.println("Hello, world!");
    }

    public static double sum(double a, double b)
    {
        return a+b;
    }

    public static String twice(String s)
    {
        return s+s;
    }

    public static boolean isOdd(int n)
    {
        if (n%2 == 1)
        {
            // another line
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args)
    {
        hello(); 

        double a = 5.0;
        double b = 7.0;
        System.out.println("a+b: " + sum(a, b));

        double c = sum(6.23, 7.3412345);
        System.out.println("a+b: " + c);

        String result = twice("Hello, APCS! ");
        System.out.println(result);

        System.out.println("isOdd(5): " + isOdd(5));
        System.out.println("isOdd(7): " + isOdd(7));
        System.out.println("isOdd(8): " + isOdd(8));

    }
}


```
