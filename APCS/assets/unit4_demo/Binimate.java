//
// Binimate.java
//


public class Binimate
{
    public static String binimate(String s)
    {
        String result = ""; 

        for (int i=0; i<s.length(); i++)
        {
            if (i%2 == 0) // even
            {
                String letter = s.substring(i, i+1);
                result += letter;
            }
        }

        return result;
    }


    public static void testBinimate(String s, String expected)
    {
        String result = binimate(s);

        System.out.print("s: " + s + " expected: " + expected + " result: " + result);
        
        if (result.equals(expected))
            System.out.print(" I am a winner!");
        else
            System.out.print(" I am sad.");

        System.out.println();
    }


    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        // decimate == kill every 1/10

        // unit tests

        testBinimate("Briley", "Bie");
        testBinimate("Jasmine", "Jsie");
        testBinimate("Sophia", "Spi");
    }
}


