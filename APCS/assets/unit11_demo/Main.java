//
// Main.java
//


public class Main
{
    public static void main(String[] args)
    {
        /*
        Person person = new Person();
        person.setName("Dr. Kessner");
        person.greeting();

        Student student = new Student();
        student.setName("Briley");
        student.greeting();
        */


        Person person = new Person("Dr. Kessner");
        person.greeting();

        Student student = new Student("Briley");
        student.greeting();
    }
}


