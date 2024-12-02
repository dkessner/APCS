//
// ArrayAlgorithms.java
//


import java.util.*;


public class ArrayAlgorithms
{

    public static ArrayList<String> getFizzBuzz(int n)
    {
        ArrayList<String> result = new ArrayList<String>();

        for (int i=0; i<=n; i++)
        {
            if (i%15 == 0)
                result.add("FizzBuzz");
            else if (i%3 == 0)
                result.add("Fizz");
            else if (i%5 == 0)
                result.add("Buzz");
            else
                result.add("" + i);
        }

        return result;
    }

    public static ArrayList<Integer> getLengths(String[] names)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (String name : names)
        {
            result.add(name.length());            
        }

        return result;
    }

    public static ArrayList<Double> filterGoodScores(double[] scores)
    {
        ArrayList<Double> result = new ArrayList<Double>();

        for (double value : scores)
        {
            if (value > 92.5)
                result.add(value);
        }

        return result;
    }


    public static double minValue(double[] values)
    {
        if (values == null || values.length == 0)
        {
            // do one of these:
            //return Double.NaN;
            return Double.MAX_VALUE;
        }

        double result = values[0];        

        for (double value : values)
        {
            if (value < result)
                result = value;
        }

        return result;
    }


    public static void main(String[] args)
    {
        System.out.println("Hello, array algorithms!");

        // find algorithm

        double[] values = {10, 30, 50, 20, 5, 40, 60};
        System.out.println("min: " + minValue(values));

        double[] values2 = {};
        System.out.println("min: " + minValue(values2));

        double[] values3 = null;
        System.out.println("min: " + minValue(values3));

        // filter

        double[] scores = {95.3, 92.0, 77.3, 88.5, 98.9};

        System.out.print("scores: ");
        for (double score : scores)
            System.out.print(score + " ");
        System.out.println();
    
        ArrayList<Double> goodScores = filterGoodScores(scores);
        System.out.print("good scores: ");
        for (double score : goodScores)
            System.out.print(score + " ");
        System.out.println();
        System.out.println();

        // transform

        String[] names = {"Tessa", "Luna", "Briley", "Linda"};
        System.out.print("names: ");
        for (String name : names)
            System.out.print(name + " ");
        System.out.println();

        ArrayList<Integer> lengths = getLengths(names);
        System.out.println(lengths);
        System.out.println();

        // sequence generation

        ArrayList<String> fizzBuzz = getFizzBuzz(30);
        System.out.println("fizzBuzz:\n" + fizzBuzz);
    }
}


