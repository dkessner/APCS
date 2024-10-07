//
// HelloLoops.java
//


public class HelloLoops
{
    public static void main(String[] args)
    {
        System.out.println("Hello, loops!");

        // for loop:
        //
        // initialization:  int i = 0
        // condition: i<10 
        // update: i++ 

        for (int i=0; i<10; i++)
        {
            System.out.println("hello " + i);
        }

        System.out.println();

        // while loop
        
        int i = 0;

        while (i < 10)   // condition
        {
            System.out.println("hello " + i);
            i++;
        }

        System.out.println();

        // do-while loop

        i = 0;

        do 
        {
            System.out.println("hello " + i);
            i++;
        } while (i<10);  // condition checked at end
    }
}


