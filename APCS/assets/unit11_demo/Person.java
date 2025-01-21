//
// Person.java
//


public class Person
{
    public Person(String name)
    {
        this.name = name;
    }

    public void greeting()
    {
        System.out.println("Hello, my name is " + name); 
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    protected String name;
}


