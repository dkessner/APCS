//
// HelloArrays.java
//


public class HelloArrays
{
    public static void hello()
    {
        int[] numbers = {1, 3, 5, 7};

        System.out.println("numbers length: " + numbers.length);
        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers[3]: " + numbers[3]);

        // change a value

        numbers[3] = 8;

        // iteration with for loop

        System.out.println();

        for (int i=0; i<numbers.length; i++)
        {
            int value = numbers[i];
            System.out.println("i: " + i + " numbers[i]: " + value);
        }

        // iteration with for-each loop

        System.out.println();

        for (int value : numbers)
        {
            System.out.println("value: " + value);
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Hello, arrays!");
        hello();
    }
}


