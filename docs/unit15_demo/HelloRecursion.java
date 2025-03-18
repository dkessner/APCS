//
// HelloRecursion.java
//


public class HelloRecursion
{
    public static int g(int y)
    {
        return 0;
    }

    public static int f(int x)
    {
        int a = 5;
        int b = g(a);
        return 0;
    }


    public static int factorial(int n)
    {
        if (n == 0)
            return 1;
        
        return n * factorial(n-1);
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, recursion!");

        System.out.println(factorial(3)); // 6
        System.out.println(factorial(4)); // 24
        System.out.println(factorial(5)); // 120
    }
}


