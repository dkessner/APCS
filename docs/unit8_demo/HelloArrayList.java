//
// HelloArrayList.java
//


import java.util.*;


public class HelloArrayList
{
    public static void main(String[] args)
    {
        System.out.println("Hello, ArrayList!");

        ArrayList<String> words = new ArrayList<String>();
        words.add("Tessa");
        words.add("Luna");
        words.add("Claire");

        System.out.println(words);

        // array: .length
        // String: .length()
        // ArrayList: .size()

        System.out.println("words.size(): " + words.size());

        // array:       words[0]
        // ArrayList:   words.get(0)

        System.out.println("words.get(0): " + words.get(0));
        System.out.println("words.get(1): " + words.get(1));
        System.out.println();

        // iteration

        for (String word : words)
            System.out.println(word);

        System.out.println();

        for (int i=0; i<words.size(); i++)
        {
            String word = words.get(i);
            System.out.println(word);
        }

        // ArrayList of numbers

        //ArrayList<int> numbers = new ArrayList<int>();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1); // numbers.add(new Integer(1)) (auto-boxing)
        numbers.add(3);
        numbers.add(5);

    }
}


