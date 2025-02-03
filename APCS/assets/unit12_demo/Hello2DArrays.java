//
// Hello2DArrays.java
//


public class Hello2DArrays
{
    public static void printStuff(int[][] values)
    {
        for (int i=0; i<values.length; i++) // for each row
        {
            // print the ith row
            for (int j=0; j<values[i].length; j++) 
            {
                System.out.print(values[i][j] + " "); // no newline
            }

            System.out.println(); // print a newline
        }

        System.out.println();
    }

    public static void printStuff2(int[][] values)
    {
        for (int[] row : values) // for each row
        {
            for (int value : row) 
            {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println();
    }


    public static int sum(int[][] values)
    {
        int total = 0;

        for (int[] row : values)
        {
            for (int value : row)
                total += value;
        }

        return total;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, 2D Arrays!");

        int[][] values = { 
            {1, 3, 5}, 
            {2, 4}, 
            {6} 
        };

        System.out.println("values.length: " + values.length);
        System.out.println("values[0][0]: " + values[0][0]);
        // System.out.println("values[2][1]: " + values[2][1]); // array out of bounds exception
        System.out.println("values[2][1]: " + values[2][0]);
    
        printStuff(values);

        printStuff2(values);

        // initialization

        int[][] values2 = new int[10][10];

        // fill in 1 on diagonal, 0 everywhere else

        for (int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
                if (i == j)
                    values2[i][j] = 1;
                else
                    values2[i][j] = 0;
            }
        }

        printStuff(values2);

        // computation

        System.out.println("sum(values):" + sum(values));  // 21
        System.out.println("sum(values2):" + sum(values2));  // 10
    }
}


