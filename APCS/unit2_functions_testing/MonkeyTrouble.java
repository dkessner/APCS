//
// MonkeyTrouble.java
//


public class MonkeyTrouble
{
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) 
    {
        return aSmile == bSmile;
    }

    public static void testMonkeyTrouble(boolean aSmile,
            boolean bSmile, boolean expected)
    {
        boolean result = monkeyTrouble(aSmile, bSmile);
        
        System.out.print("aSmile: " + aSmile +
                " bSmile: " + bSmile + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("YAY!");
        else
            System.out.println("Boohoo!");

    }


    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        testMonkeyTrouble(true, true, true);
        testMonkeyTrouble(false, false, true);
        testMonkeyTrouble(true, false, false);
        testMonkeyTrouble(false, true, false);
    }
}


