//
// Student.java
//


// Student extends Person
// Student is a subclass of Person
// Student inherits from Person

// Student "is a" Person

public class Student extends Person
{
    public Student(String name)
    {
        super(name);
    }

    public void greeting()
    {
        System.out.println("Hello, I'm a student, and my name is " + name); 
    }
}


