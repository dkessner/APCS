//
// HelloAlgorithms.java
//


public class HelloAlgorithms
{

    public static int findE(String s)
    {
        // find first 'e' character in the String s

        for (int i=0; i<s.length(); i++)
        {
            String sub = s.substring(i, i+1);
            if (sub.equals("e"))
                return i;
        }

        return -1;
    }


    public static int countE(String s)
    {
        // count the number of e's 

        int total = 0;

        for (int i=0; i<s.length(); i++)
        {
            String sub = s.substring(i, i+1);
            if (sub.equals("e"))
                total += 1; 
        }

        return total;
    }

    
    public static int sum(int n)
    {
        int total = 0;

        for (int i=1; i<=n; i++) // iterate:  i == 1, 2, 3, ..., n (includes n)
        {
            // update total variable
            total += i;
        }

        return total;
    }


    public static void main(String[] args)
    {
        System.out.println("Hello, algorithms!");

        String s = "Dr. Kessner";

        int position = findE(s); // 5
        System.out.println("position: " + position);

        int count = countE(s); // 2
        System.out.println("count: " + count);

        int result = sum(4); // 1+2+3+4 == 10
        System.out.println("sum(4): " + result);
        System.out.println("sum(5): " + sum(5)); // 1+2+3+4+5 == 15
    }
}


