//
// HelloRandom.java
//



public class HelloRandom
{
    public static void main(String[] args)
    {
        for (int tessa=0; tessa<5; tessa++)
        {
            int value = (int) (Math.random() * 10 + 1);
            System.out.print(value + " ");

            if (value % 2 == 0)
                System.out.println("Even");
            else
                System.out.println();
        }
    }
}


