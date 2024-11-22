//
// Basics.java
//


public class Basics
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        // basic types: int, float, double, boolean

        int n = 5;
        System.out.println(n);

        n = 7;
        System.out.println(n);

        float x = 1.23f; // floating point
        System.out.println(x);

        double y = 1.23;
        System.out.println(y);

        double my_number = 5.67;  // snake case
        System.out.println(my_number);

        double myNumber = 5.67;  // camel case
        System.out.println(myNumber);

        // this is a comment

        /*
        this is a multiline comment
        this is a multiline comment
        */

        boolean isHappy = true;
        System.out.println(isHappy);
        
        // isHappy = 5; // error
        
        // reference types:  String, ...

        String hello = "Hello, world!";
        System.out.println(hello);

        hello = "blah";
        System.out.println(hello);
    }
}


