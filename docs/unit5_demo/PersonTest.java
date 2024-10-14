//
// PersonTest.java
//


public class PersonTest
{
    public static void main(String[] args)
    {
        System.out.println("Hello, Person!");


        Person drkessner = new Person("Dr. Kessner");

        // error: private access
        //drkessner.name = "Dr. Kessner";
       
        //drkessner.setName("Dr. Kessner");        
        drkessner.greeting();

        System.out.println("That guy's name is " + drkessner.getName());


        Person luna = new Person("Luna");
        luna.greeting();
    }
}


