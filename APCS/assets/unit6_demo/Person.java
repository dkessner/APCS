//
// Person.java
//


public class Person
{
    public Person()
    {
        value = 5;
    }

    public void greeting(int value)
    {
        System.out.println("value: " + value);
        System.out.println("this.value: " + this.value);
    }

    private int value;
}


