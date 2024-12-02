# Sequences.java
```java
//
// Sequences.java
//


public class Sequences
{
    public static void main(String[] args)
    {
        System.out.println("Sequences");
        System.out.println();

        // print multiples of 7

        for (int i=0; i<50; i++)
        {
            if (i%7 == 0)
                System.out.println(i);
        }

        System.out.println();

        // = assignment operator
        // == comparison

        // i += 7 means:  i = i+7
        // i++ means:  i+=1 or i=i+1

        for (int i=0; i<50; i+=7)
            System.out.println(i);

        System.out.println();

        // arithmetic sequence:
        // 3, 10, 17, 24, ...

        // explicit formula
        
        for (int i=0; i<10; i++)
            System.out.println(i*7 + 3);

        System.out.println();

        // recursive

        int value = 3;

        for (int i=0; i<10; i++)
        {
            System.out.println(value);
            value += 7;
        }

        System.out.println();


    }
}


```
