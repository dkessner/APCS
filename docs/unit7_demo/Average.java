//
// Average.java
//


public class Average
{
    public static double average(double[] values)
    {
        double total = 0;

        for (double x : values)
            total += x; 

        return total / values.length;
    }

    public static void testAverage(double[] values, double expected)
    {
        double result = average(values);

        for (double value : values)
            System.out.print(value + " ");

        System.out.print(" expected: " + expected +
                           " result: " + result + " ");

        if (Math.abs(result-expected) < 1e-6) // fuzzy comparison
            System.out.println("Yippee!!!");
        else
            System.out.println("Ugh!!!");
    }

    public static void main(String[] args)
    {
        double[] values = {1.0, 3.0, 5.0};
        double[] values2 = {200, 400, 600, 800};
        double[] values3 = {};
        
        testAverage(values, 3.0);
        testAverage(values2, 500);
        testAverage(values3, Float.NaN);
    }
}


