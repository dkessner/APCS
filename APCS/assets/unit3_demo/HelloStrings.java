//
// HelloStrings.java
//



public class HelloStrings
{
    public static void main(String[] args)
    {
        String hello = "HelloWorld";
        System.out.println(hello);

        System.out.println("length:" + hello.length());

        String firstPart = hello.substring(0,5); 
        System.out.println("firstPart:" + firstPart);

        String secondPart = hello.substring(5); // equivalent to substring(0,10)
        System.out.println("secondPart:" + secondPart);
    }
}


